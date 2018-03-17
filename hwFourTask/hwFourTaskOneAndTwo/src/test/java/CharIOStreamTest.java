package test.java;

import main.java.CharIOStream;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CharIOStreamTest {
    public String getTextFromFile(String fileName) throws IOException {
        StringBuilder stringsFromBuffer = CharIOStream.readFile(fileName);
        return stringsFromBuffer.toString();
    }

    @Test
    public void findKeywordsShouldReturnKeywordsAndCountForExampleFile() throws IOException {
        CharIOStream.keywordsSearcher("src\\test\\resources\\Example.java", "keyWords.txt");
        assertEquals("package public class public static void int int double Number of found keywords: 9", getTextFromFile("keyWords.txt"));
    }

    @Test(expected = IOException.class)
    public void findKeywordsShouldCatchIOException() throws IOException {
        CharIOStream.keywordsSearcher("src\\test\\resources\\E.java", "keyWords.txt");
    }
}

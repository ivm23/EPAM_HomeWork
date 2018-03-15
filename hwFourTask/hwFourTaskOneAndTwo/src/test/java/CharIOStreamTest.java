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
    public void findKeywordsShouldReturnKeywordsAndCountForEampleFile() throws IOException {
        CharIOStream.keywordsSearcher("C:\\Users\\marina\\IdeaProjects\\hwFourTaskOne\\src\\Example.java", "keyWords.txt");
        assertEquals("public class public static void int int double Number of found keywords: 8", getTextFromFile("keyWords.txt"));
    }

    @Test(expected = FileNotFoundException.class)
    public void findKeywordsShouldCatchFileNotFoundException() throws IOException {
        CharIOStream.keywordsSearcher("C:\\Users\\marina\\IdeaProjects\\hwFourTaskOne\\src\\E.java", "keyWords.txt");
    }
}

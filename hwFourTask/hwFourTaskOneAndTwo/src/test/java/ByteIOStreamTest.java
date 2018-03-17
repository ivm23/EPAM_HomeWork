package test.java;
import main.java.ByteIOStream;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.assertEquals;

public class ByteIOStreamTest {

    public String getTextFromFile(String fileName) throws IOException {
        StringBuilder stringsFromBuffer = ByteIOStream.readFile(fileName);
        return stringsFromBuffer.toString();
    }

    @Test
    public void findKeywordsShouldReturnKeywordsAndCountForExampleFile() throws IOException {
        ByteIOStream.keywordsSearcher("src\\test\\resources\\Example.java", "keyWords.txt");
        assertEquals("package public class public static void int int double \nNumber of found keywords: 9", getTextFromFile("keyWords.txt"));
    }

    @Test (expected = IOException.class)
    public void findKeywordsShouldCatchIOException() throws IOException {
        ByteIOStream.keywordsSearcher("src\\test\\resources\\E.java", "keyWords.txt");
    }
}

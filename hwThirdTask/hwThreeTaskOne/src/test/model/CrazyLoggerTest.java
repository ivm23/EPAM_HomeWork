package test.model;

import main.model.*;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CrazyLoggerTest {
    private CrazyLogger crazyLogger;
    private Date dateNow;
    private SimpleDateFormat dateFormat;

    @Before
    public void setUp() {
        crazyLogger = new CrazyLogger();
        dateNow = Date.from(Instant.now());
        dateFormat = new SimpleDateFormat("dd-mm-yyyy : hh-mm");
    }

    @Test
    public void findInfoInLogShouldReturnCountOfFindMessages() {
        crazyLogger.addMessage("Hello");
        crazyLogger.addMessage("HelloWorld");
        crazyLogger.addMessage("Elloh");
        crazyLogger.addMessage("Heflo");
        int countOfFindMessages = crazyLogger.findInfo("Hello").size();
        assertEquals(2, countOfFindMessages);
    }
    @Test
    public void findInfoInLogShouldReturnZero() {
        crazyLogger.addMessage("Hello");
        crazyLogger.addMessage("HelloWorld");
        int countOfFindMessages = crazyLogger.findInfo("abs").size();
        assertEquals(0, countOfFindMessages);
    }

    @Test
    public void findInfoByDateInLogShouldReturnCountOfFindMessages() {
        crazyLogger.addMessage("Hello");
        int countOfFindMessages = crazyLogger.findInfoByDate(dateNow).size();
        assertEquals(1, countOfFindMessages);
    }

    @Test
    public void isEmptyShouldReturnTrueForEmptyLog() {
        assertTrue(crazyLogger.isEmpty());
    }

    @Test
    public void setMessageInEmptyLoggerShouldReturnOneNoteAboutDateAndMessage() {
        crazyLogger.addMessage("hello");
        assertEquals(dateFormat.format(dateNow) + " - hello\n", crazyLogger.toString());
    }

    @Test
    public void charAtIndexShoulReturnIndexCharOfLog() {
        crazyLogger.addMessage("hello");
        assertEquals('l', crazyLogger.charAt(23));
    }

    @Test
    public void subSequenceShoulReturnSubSequenceFromStartIndexToEndIndex() {
        crazyLogger.addMessage("hello");
        assertEquals("hello", crazyLogger.subSequence(21, 26));
    }

    @Test
    public void indexOfShoulReturnIndexOfString() {
        crazyLogger.addMessage("hello");
        assertEquals(21, crazyLogger.indexOf("hello"));
    }

    @Test
    public void indexOfShoulReturnIndexOfStringFromThisIndex() {
        crazyLogger.addMessage("hlelo");
        assertEquals(24, crazyLogger.indexOf("l", 23));
    }

    @Test
    public void lastIndexOfShoulReturnLastIndexOfString() {
        crazyLogger.addMessage("hlelol");
        assertEquals(26, crazyLogger.lastIndexOf("l"));
    }

    @Test
    public void lastIndexOfShoulReturnLastIndexFromThisIndex() {
        crazyLogger.addMessage("hlleo");
        assertEquals(23, crazyLogger.lastIndexOf("l", 24));
    }

    @Test
    public void containShouldReturnTrueForStringContainOtherString() {
        crazyLogger.addMessage("hello");
        assertTrue(crazyLogger.contains("ll"));
    }

    @Test
    public void endsWithShouldReturnTrueForStringEndsWithOtherString() {
        crazyLogger.addMessage("hello");
        assertTrue(crazyLogger.endsWith("lo\n"));
    }

    @Test
    public void startsWithShouldReturnFalseForStringEndsWithOtherString() {
        crazyLogger.addMessage("hello");
        assertFalse(crazyLogger.startsWith("hel"));
    }

    @Test
    public void endsWithShouldReturnTrueFroStringEndsWirhOtherString() {
        crazyLogger.addMessage("hello");
        assertTrue(crazyLogger.contains("lo"));
    }

    @Test
    public void getStringOfIndexShouldReturnFirstStringInLog() {
        crazyLogger.addMessage("hello");
        crazyLogger.addMessage("message");
        System.out.print(crazyLogger.getStringIndexOf(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getStringOfIndexShouldCatchArrayIndexOutOfBoundsExceptionForSecondStringInLog() {
        crazyLogger.addMessage("hello");
        crazyLogger.addMessage("message");
        System.out.print(crazyLogger.getStringIndexOf(2));
    }

}

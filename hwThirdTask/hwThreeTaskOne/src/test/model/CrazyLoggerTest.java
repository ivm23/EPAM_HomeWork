package test.model;

import main.model.*;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
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
        dateNow = new Date();
        dateFormat = new SimpleDateFormat("dd-mm-yyyy : hh-mm");
    }

    @Test
    public void isEmptyShouldReturnTrueForEmptyLog() {
        assertTrue(crazyLogger.isEmpty());
    }

    @Test
    public void setMessageInEmptyLoggerShouldReturnOneNoteAboutDateAndMessage() {
        crazyLogger.setMessage("hello");
        assertEquals(dateFormat.format(dateNow) + " - hello\n", crazyLogger.toString());
    }

    @Test
    public void charAtIndexShoulReturnIndexCharOfLog() {
        crazyLogger.setMessage("hello");
        assertEquals('l', crazyLogger.charAt(23));
    }

    @Test
    public void subSequenceShoulReturnSubSequenceFromStartIndexToEndIndex() {
        crazyLogger.setMessage("hello");
        assertEquals("hello", crazyLogger.subSequence(21, 26));
    }

    @Test
    public void indexOfShoulReturnIndexOfString() {
        crazyLogger.setMessage("hello");
        assertEquals(21, crazyLogger.indexOf("hello"));
    }

    @Test
    public void indexOfShoulReturnIndexOfStringFromThisIndex() {
        crazyLogger.setMessage("hlelo");
        assertEquals(24, crazyLogger.indexOf("l", 23));
    }

    @Test
    public void lastIndexOfShoulReturnLastIndexOfString() {
        crazyLogger.setMessage("hlelol");
        assertEquals(26, crazyLogger.lastIndexOf("l"));
    }

    @Test
    public void lastIndexOfShoulReturnLastIndexFromThisIndex() {
        crazyLogger.setMessage("hlleo");
        assertEquals(23, crazyLogger.lastIndexOf("l", 24));
    }

    @Test
    public void containShouldReturnTrueForStringContainOtherString() {
        crazyLogger.setMessage("hello");
        assertTrue(crazyLogger.contains("ll"));
    }

    @Test
    public void endsWithShouldReturnTrueForStringEndsWithOtherString() {
        crazyLogger.setMessage("hello");
        assertTrue(crazyLogger.endsWith("lo\n"));
    }

    @Test
    public void startsWithShouldReturnFalseForStringEndsWithOtherString() {
        crazyLogger.setMessage("hello");
        assertFalse(crazyLogger.startsWith("hel"));
    }

    @Test
    public void endsWithShouldReturnTrueFroStringEndsWirhOtherString() {
        crazyLogger.setMessage("hello");
        assertTrue(crazyLogger.contains("lo"));
    }

    @Test
    public void getStringOfIndexShouldReturnFirstStringInLog() {
        crazyLogger.setMessage("hello");
        crazyLogger.setMessage("message");
        System.out.print(crazyLogger.getStringIndexOf(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getStringOfIndexShouldCatchArrayIndexOutOfBoundsExceptionForSecondStringInLog() {
        crazyLogger.setMessage("hello");
        crazyLogger.setMessage("message");
        System.out.print(crazyLogger.getStringIndexOf(2));
    }

}

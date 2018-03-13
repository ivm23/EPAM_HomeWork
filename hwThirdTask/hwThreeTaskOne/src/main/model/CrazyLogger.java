package main.model;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CrazyLogger {
    private StringBuilder log;
    private SimpleDateFormat dateFormat;
    private Date dateNow;

    public CrazyLogger() {
        log = new StringBuilder();
        dateFormat = new SimpleDateFormat("dd-mm-yyyy : hh-mm");
        dateNow = new Date();
    }

    public CrazyLogger(String message) {
        log = new StringBuilder();
        dateFormat = new SimpleDateFormat("dd-mm-yyyy : hh-mm");
        dateNow = new Date();

        log.append(dateFormat.format(dateNow) + " - " + message);
    }

    public StringBuilder getLog() {
        return log;
    }

    public void setMessage(String message) {
        log.append(dateFormat.format(dateNow) + " - " + message + '\n');
    }

    public char charAt(int index) {
        return log.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return log.subSequence(start, end);
    }

    public String toString() {
        return log.toString();
    }

    public int indexOf(String str) {
        return log.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return log.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return log.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return log.lastIndexOf(str, fromIndex);
    }

    public boolean contains(CharSequence cs) {
        return log.toString().contains(cs);
    }

    public boolean isEmpty() {
        return log.toString().isEmpty();
    }

    public boolean endsWith(String suffix) {
        return log.toString().endsWith(suffix);
    }

    public boolean startsWith(String prefix) {
        return log.toString().startsWith(prefix);
    }

    public String substring(int startIndex) {
        return log.substring(startIndex);
    }

    public String substring(int startIndex, int endIndex) {
        return log.substring(startIndex, endIndex);
    }

    public void printLog() {
        System.out.print(log.toString());
    }

    public String getStringIndexOf(int index) {
        int indexOfChar = 0;
        int beginIndex = 0;
        int endIndex = 0;
        int countOfLineBreak = 0;

        while (indexOfChar < log.length()) {
            if (countOfLineBreak == index) {
                beginIndex = indexOfChar;
                while (log.charAt(indexOfChar) != '\n') {
                    ++indexOfChar;
                }
                endIndex = indexOfChar;
                break;
            }
            if (log.charAt(indexOfChar) == '\n') {
                ++countOfLineBreak;
            }
            ++indexOfChar;
        }
        if (beginIndex == 0 && endIndex == 0) {
            throw new ArrayIndexOutOfBoundsException("string with such index isn't exist!");
        }
        return log.substring(beginIndex, endIndex);
    }
}

package main.model;

import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;


public class CrazyLogger {
    private StringBuilder log;
    private SimpleDateFormat dateFormat;

    public CrazyLogger() {
        log = new StringBuilder();
        dateFormat = new SimpleDateFormat("dd-mm-yyyy : hh-mm");
    }

    public CrazyLogger(String message) {
        log = new StringBuilder();
        dateFormat = new SimpleDateFormat("dd-mm-yyyy : hh-mm");
        Calendar date = Calendar.getInstance();
        log.append(dateFormat.format(date.getTime()) + " - " + message + '\n');
    }

    public StringBuilder getLog() {
        return log;
    }

    public void addMessage(String message) {
        Calendar date = Calendar.getInstance();
        log.append(dateFormat.format(date.getTime()) + " - " + message + '\n');
    }



    public int findInfo(String stringForFind) {
        int index = log.indexOf(stringForFind);

        List<String> findMessages = new ArrayList<>();

        while (index != -1) {
            int beginIndex = index;

            while (!(beginIndex == 0 || log.charAt(beginIndex) == '\n')) {
                --beginIndex;
            }
            index = log.indexOf("\n", index);

            findMessages.add(log.subSequence(beginIndex, index).toString());
            index = log.indexOf(stringForFind, index);
        }

        printFindMessages(findMessages);

        return findMessages.size();
    }

    public int findInfoByDate(Date date) {
        String stringDate = dateFormat.format(date);
        return findInfo(stringDate);
    }

    public int findInfoByDate(int day, int month, int year, int hour, int minute) throws Exception {
        return findInfo(convertToDate(day, month, year, hour, minute));
    }

    public String convertToDate(int day, int month, int year, int hour, int minute) throws Exception {

        if (!(0 <= minute && minute < 60) || !(0 <= hour && hour < 24)) {
            throw new Exception("Incorrect time!");
        }
        if (!(0 < month && month < 13) || !(0 < day && day < 32)) {
            throw new Exception("Incorrect date!");
        }
        if (month == 4 || month == 6 || month == 9 || month == 11 && day > 30) {
            throw new Exception("Incorrect date!");
        }
        if (month == 2 && day > 28) {
            throw new Exception("Incorrect date!");
        }

        Calendar date = new GregorianCalendar(year, month, day, hour, minute);

        return dateFormat.format(date.getTime());
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
    private void printFindMessages(List<String> listForPrint) {
        if (listForPrint.size() == 0) {
            System.out.println("No such information!");
        } else {
            System.out.println(String.format("Found %d message(s): ", listForPrint.size()));

            for (String message : listForPrint) {
                System.out.print(message);
            }
        }
    }
}

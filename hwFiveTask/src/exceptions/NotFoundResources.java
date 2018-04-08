package exceptions;

import java.util.Locale;

public class NotFoundResources extends Exception{
    private String fileName;
    private Locale locale;

    public NotFoundResources(String fileName, Locale locale) {
        this.fileName = fileName;
        this.locale = locale;
        System.out.println(fileName + locale.toString() + "is not found!");
    }
}

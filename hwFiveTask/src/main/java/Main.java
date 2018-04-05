package main.java;

import java.util.Locale;

public class Main {

    static final String str = "main/resources/resources";

    public static void main(String[] args) throws Exception {
        PropertiesFileGetter propertiesFileGetter = new PropertiesFileGetter();
        propertiesFileGetter.getPropertiesFile(str, new Locale("en_US"));
        System.out.print(PropertiesFileGetter.getProperty("1"));
    }
}
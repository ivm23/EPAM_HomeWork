package main.java;

import java.util.Locale;

public class Main {

    static final String str = "main/resources/resources";

    public static void main(String[] args) {
        PropertiesFileGetter propertiesFileGetter = new PropertiesFileGetter();
        propertiesFileGetter.getProperties(str, new Locale("en_US"));
        System.out.print(PropertiesFileGetter.getPropertiesMap());
    }
}
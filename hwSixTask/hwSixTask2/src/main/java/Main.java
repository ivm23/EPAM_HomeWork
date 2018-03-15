package main.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;

public class Main {

    static final String str = "main/resources/resources";
    public static void main(String[] args) {
        PropertiesFileGetter.getProperties(str, new Locale("en_US"));
        System.out.print(PropertiesFileGetter.getPropertiesMap());
    }
}
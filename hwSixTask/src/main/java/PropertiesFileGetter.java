package main.java;

import javafx.util.Pair;

import java.util.*;

public class PropertiesFileGetter {
    private static Map<Pair<String, Locale>, ResourceBundle> existBundle;
    private static Map<String, Object> propertiesMap = new LinkedHashMap<>();

    public PropertiesFileGetter() {
        existBundle = new HashMap<Pair<String, Locale>, ResourceBundle>();
    }

    public static Map getPropertiesMap() {
        return propertiesMap;
    }

    public void getProperties(String fileName, Locale locale) {
        Pair<String, Locale> fileNameAndLocale = new Pair<>(fileName, locale);
        if (!existBundle.containsKey(fileNameAndLocale)) {
            existBundle.put(fileNameAndLocale, ResourceBundle.getBundle(fileName, locale));
        }

        ResourceBundle bundle = existBundle.get(fileNameAndLocale);
        Set<String> keys = new HashSet<>(bundle.keySet());

        for (String key : keys) {
            propertiesMap.put(key, bundle.getObject(key));
        }
    }

}
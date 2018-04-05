package main.java;

import javafx.util.Pair;

import java.util.*;

public class PropertiesFileGetter {
    private static Map<Pair<String, Locale>, ResourceBundle> existBundle;
    private static Map<String, Object> propertiesMap = new LinkedHashMap<>();

    public PropertiesFileGetter() {
        existBundle = new HashMap<Pair<String, Locale>, ResourceBundle>();
    }

    public static Object getProperty(String key) throws Exception {
        if (!propertiesMap.containsKey(key)) {
            throw new Exception("Such key isn't exist!");
        }
        return propertiesMap.get(key);
    }

    public void getPropertiesFile(String fileName, Locale locale) {
        Pair<String, Locale> fileNameAndLocale = new Pair<>(fileName, locale);
        if (!existBundle.containsKey(fileNameAndLocale)) {
            try {
                existBundle.put(fileNameAndLocale, ResourceBundle.getBundle(fileName, locale));
            } catch (MissingResourceException ex) {
                throw ex;
            }
        }

        ResourceBundle bundle = existBundle.get(fileNameAndLocale);
        Set<String> keys = new HashSet<>(bundle.keySet());

        for (String key : keys) {
            propertiesMap.put(key, bundle.getObject(key));
        }
    }

}
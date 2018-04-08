package main.java;

import exceptions.NotFoundKey;
import exceptions.NotFoundResources;
import javafx.util.Pair;

import java.util.*;

public class PropertiesFileGetter {
    private static Map<Pair<String, Locale>, ResourceBundle> existBundle;
    private static Map<String, Object> propertiesMap = new LinkedHashMap<>();

    public PropertiesFileGetter() {
        existBundle = new HashMap<Pair<String, Locale>, ResourceBundle>();
    }

    public static Object getProperty(String key) throws NotFoundKey {
        if (!propertiesMap.containsKey(key)) {
            throw new NotFoundKey(key);
        }
        return propertiesMap.get(key);
    }

    public void getPropertiesFile(String fileName, Locale locale) throws NotFoundResources {
        Pair<String, Locale> fileNameAndLocale = new Pair<>(fileName, locale);
        if (!existBundle.containsKey(fileNameAndLocale)) {
            try {
                existBundle.put(fileNameAndLocale, ResourceBundle.getBundle(fileName, locale));
            } catch (MissingResourceException ex) {
                System.out.println("Such file isn't exist!");
                throw new NotFoundResources(fileName, locale);
            }
        }

        ResourceBundle bundle = existBundle.get(fileNameAndLocale);
        Set<String> keys = new HashSet<>(bundle.keySet());

        for (String key : keys) {
            propertiesMap.put(key, bundle.getObject(key));
        }
    }

}
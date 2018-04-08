package main.java;

import java.util.*;

public class PropertiesFileGetter {
    private static ResourceBundle bundle;
    private static Map<String, Object> propertiesMap = new LinkedHashMap<>();

    public static Map getPropertiesMap(){
        return propertiesMap;
    }

    public static void getProperties(String fileName, Locale locale) {
        bundle = ResourceBundle.getBundle(fileName, locale);

        Set<String> keys = new HashSet<>(bundle.keySet());

        for (String key: keys) {
            propertiesMap.put(key, bundle.getObject(key));
        }
    }

}

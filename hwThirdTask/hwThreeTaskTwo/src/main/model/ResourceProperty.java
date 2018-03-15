package main.model;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceProperty {
    private ResourceBundle bundle;

    public ResourceProperty(Locale locale) {
        bundle = ResourceBundle.getBundle("main/model/resources/questions", locale);
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }

    public Set<String> keySet() {
        return bundle.keySet();
    }

}

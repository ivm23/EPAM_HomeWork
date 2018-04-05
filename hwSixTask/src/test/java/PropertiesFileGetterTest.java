package test.java;

import main.java.PropertiesFileGetter;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class PropertiesFileGetterTest {
    private static String fileName;
    private Map<String, Object> answerMap;
    private PropertiesFileGetter propertiesFileGetter;

    @Before
    public void setUp() {
        fileName = "main/resources/resources";
        answerMap = new LinkedHashMap<String, Object>();

        propertiesFileGetter = new PropertiesFileGetter();

        answerMap.put("1", (Object) "1)hello");

    }

    @Test
    public void getPropertiesShouldReturnPropertiesByKey() {
        propertiesFileGetter.getPropertiesFile(fileName, new Locale("en_US"));
        assertEquals(answerMap.get("1"), PropertiesFileGetter.getProperty("1"));
    }
}
package test.java;

import main.java.PropertiesFileGetter;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class PropertiesFileGetterTest {
    private static String fileName;
    private Map<String, Object> answerMap;

    @Before
    public void setUp() {
        fileName = "main/resources/resources";
        answerMap = new LinkedHashMap<String, Object>();

        answerMap.put("1", (Object) "1)hello");
        answerMap.put("2", (Object) "2)world");
        answerMap.put("3", (Object) "3)how are you?");
    }

    @Test
    public void getPropertiesShouldReturnMapWithProperties() {
        PropertiesFileGetter.getProperties(fileName, new Locale("en_US"));
        assertEquals(answerMap, PropertiesFileGetter.getPropertiesMap());
    }
}

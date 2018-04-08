package test.java;

import exceptions.NotFoundKey;
import exceptions.NotFoundResources;
import main.java.PropertiesFileGetter;
import org.junit.Test;
import org.junit.Before;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;

import static org.junit.Assert.assertEquals;
public class PropertiesTest {
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
    public void getPropertiesShouldReturnPropertiesByKey() throws NotFoundKey, NotFoundResources {
        propertiesFileGetter.getPropertiesFile(fileName, new Locale("en_US"));
        assertEquals(answerMap.get("1"), PropertiesFileGetter.getProperty("1"));
    }

    @Test(expected = NotFoundResources.class)
    public void getPropertiesShouldCatchMissingResourceExceptionForNotExistingProperties() throws NotFoundResources {
        propertiesFileGetter.getPropertiesFile("1", new Locale("bu_po"));
        // если имя будет верное, а локаль нет, то вернется properties по имени
    }

    @Test(expected = NotFoundKey.class)
    public void getPropertiesShouldCatchExceptionForNotExistingKeyInProperties() throws NotFoundKey, NotFoundResources {
        propertiesFileGetter.getPropertiesFile(fileName, new Locale("en_US"));
        assertEquals("Such key isn't exist!", PropertiesFileGetter.getProperty("4"));
    }
}

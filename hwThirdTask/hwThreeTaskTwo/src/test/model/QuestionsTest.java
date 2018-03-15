package test.model;

import main.model.ResourceProperty;
import org.junit.Test;
import org.junit.Before;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QuestionsTest {
    private List<String> rightKeys;
    private List<String> rightEnValues;
    private List<String> rightRuValues;

    @Before
    public void setUp() {
        rightKeys = new ArrayList<>();
        rightEnValues = new ArrayList<>();
        rightRuValues = new ArrayList<>();

        rightKeys.add("1");
        rightKeys.add("2");
        rightKeys.add("3");
        rightKeys.add("4");

        rightEnValues.add("1)Who are you?");
        rightEnValues.add("2)How are you?");
        rightEnValues.add("3)What is your name?");
        rightEnValues.add("4)What is your favourite color?");

        rightRuValues.add("1)Кто ты?");
        rightRuValues.add("2)Как твои дела?");
        rightRuValues.add("3)Как тебя зовут?");
        rightRuValues.add("4)Какой твой любимый цвет?");
    }

    @Test
    public void getKeysShouldReturnKeys() {
        ResourceProperty myBundle = new ResourceProperty(new Locale("en_US"));
        List<String> keys = new ArrayList<>();
        keys.addAll(myBundle.keySet());
        Collections.sort(keys);
        assertEquals(rightKeys, keys);
    }

    @Test
    public void ruQuestionsShouldReturnRussianQuestions() {
        ResourceProperty myBundle = new ResourceProperty(new Locale("ru_RU"));
        List<String> keys = new ArrayList<>();
        keys.addAll(myBundle.keySet());
        Collections.sort(keys);
        List<String> values = new ArrayList<>();
        for (String key : keys) {
            values.add(myBundle.getValue(key).toString());
        }
        assertEquals(rightRuValues, values);
    }

    @Test
    public void enQuestionsShouldReturnEnglishQuestions() {
        ResourceProperty myBundle = new ResourceProperty(new Locale("en_US"));
        List<String> keys = new ArrayList<>();
        keys.addAll(myBundle.keySet());
        Collections.sort(keys);
        List<String> values = new ArrayList<>();
        for (String key : keys) {
            values.add(myBundle.getValue(key).toString());
        }
        assertEquals(rightEnValues, values);
    }

}

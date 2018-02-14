package test;

import main.java.lab.model.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void toStringShouldReturnNameAndSurname() {
        Person person = new Person("AA", "BB");
        assertEquals("AA BB", person.toString());
    }

}

package test.model;

import main.model.Color;
import main.model.Pen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PenHasCodeTest {
    Pen firstPen;
    Pen secondPen;
    Pen firstPenWithDefConstructor;
    Pen secondPenWithDefConstructor;


    @Before
    public void setUp() {
        firstPen = new Pen("brand", Color.RED, 10.3);
        secondPen = new Pen("brand", Color.RED, 10.3);
        firstPenWithDefConstructor = new Pen();
        secondPenWithDefConstructor = new Pen();
    }

    @Test
    public void hasCodeEqualsPenShouldReturnTrue() {
        assertEquals(firstPen.hashCode(), secondPen.hashCode());
    }

    @Test
    public void hasCodeEqualsPenWithDefConstructorShouldReturnTrue() {
        assertEquals(firstPenWithDefConstructor.hashCode(), secondPenWithDefConstructor.hashCode());
    }

}

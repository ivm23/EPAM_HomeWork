package test.model;

import main.model.Color;
import main.model.Pen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PenEqualsTest {

    private Pen firstPen;
    private Pen secondPen;
    private Pen thirdPen;
    private Pen firstPenWithDefConstructor;
    private Pen secondPenWithDefConstructor;
    private Pen nullPen;


    @Before
    public void setUp() {
        firstPen = new Pen("brand", Color.RED, 10);
        secondPen = new Pen("brand", Color.RED, 10);
        thirdPen = new Pen("brand", Color.RED, 10);
        firstPenWithDefConstructor = new Pen();
        secondPenWithDefConstructor = new Pen();
    }

    @Test
    public void equalsPenReflexivityShouldReturnTrueForEqualsPen() { // рефлексивность
        assertTrue(firstPen.equals(firstPen));
    }

    @Test
    public void equalsPenSymmetryShouldReturnTrueForEqualsPen() { //симметричность
        assertEquals(firstPen.equals(secondPen), secondPen.equals(firstPen));
    }

    @Test
    public void equalsPenTransitivityShouldReturnTrueForEqualsPen() { //транзитивность
        assertEquals((firstPen.equals(secondPen) && secondPen.equals(thirdPen)), firstPen.equals(thirdPen));
    }

    @Test
    public void equalsPenAndNullShouldReturnFalse() { //ненулевая ссылка
        assertFalse(firstPen.equals(nullPen));
    }

    @Test
    public void equalsPenWithDefConstructorShouldReturnTrue() {
        assertTrue(firstPenWithDefConstructor.equals(secondPenWithDefConstructor));
    }
}

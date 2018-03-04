package test.model;

import main.model.Color;
import main.model.HolePuncher;
import main.model.Pen;
import main.model.Yardstick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StationeryTest {
    private Pen pen;
    private Yardstick yardstick;
    private HolePuncher holePuncher;
    private Pen secondPen;
    private Yardstick secondYardstick;
    private HolePuncher secondHolePuncher;

    @Before
    public void setUp() {
        pen = new Pen(10, "brandOfPen", Color.BLUE);
        yardstick = new Yardstick(12, "brandOfYardstick", 15.5);
        holePuncher = new HolePuncher(27, "brandOfHolePuncher");
        secondPen = new Pen(10, "brandOfPen", Color.BLUE);
        secondYardstick = new Yardstick(12, "brandOfYardstick", 15.5);
        secondHolePuncher = new HolePuncher(27, "brandOfHolePuncher");
    }

    @Test
    public void getPricePenShouldReturnPricePen() {
        assertEquals(10, pen.getPrice());
    }

    @Test
    public void getPriceYardstickShouldReturnPriceYardstick() {
        assertEquals(12, yardstick.getPrice());
    }

    @Test
    public void getPriceHolePuncherShouldReturnPriceHole() {
        assertEquals(27, holePuncher.getPrice());
    }

    @Test
    public void getBrandPenShouldReturnBrandPen() {
        assertEquals("brandOfPen", pen.getBrand());
    }

    @Test
    public void getBrandYardstickShouldReturnBrandYardstick() {
        assertEquals("brandOfYardstick", yardstick.getBrand());
    }

    @Test
    public void getBrandHolePuncherShouldReturnBrandHole() {
        assertEquals("brandOfHolePuncher", holePuncher.getBrand());
    }


    @Test
    public void getColorPenShouldReturnColorPen() {
        assertEquals(Color.BLUE, pen.getColor());
    }

    @Test
    public void getLengthYardstickShouldReturnLengthYardstick() {
        assertEquals(15.5, yardstick.getLength(), 0.0);
    }

    @Test
    public void equalsPenShouldReturnTrueForEqualsPen() {
        assertTrue(pen.equals(secondPen));
    }
    @Test
    public void equalsYardstickShouldReturnTrueForEqualsYardstick() {
        assertTrue(yardstick.equals(secondYardstick));
    }
    @Test
    public void equalsHolePuncherShouldReturnTrueForEqualsHolePuncher() {
        assertTrue(holePuncher.equals(secondHolePuncher));
    }
}

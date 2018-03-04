package test.model;
import main.model.Color;
import main.model.Pen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PenToStringTest {
    private Pen penWithDefConstructor;
    private Pen penWithColor;
    private Pen penWithColorAndPrice;
    private Pen penWithBrandColorPrice;

    @Before
    public void setUp() {
        penWithDefConstructor = new Pen();
        penWithColor = new Pen(Color.GREEN);
        penWithColorAndPrice = new Pen(Color.BLUE, 178.456);
        penWithBrandColorPrice = new Pen("brand", Color.BLACK, 19);
    }

    @Test
    public void penWithDefConstructorToStringShouldReturnTrue() {
        assertEquals("main.model.Pen@brand: null, color: UNKNOWN, price: 0.0", penWithDefConstructor.toString());
    }

    @Test
    public void penWithColorToStringShouldReturnTrue() {
        assertEquals("main.model.Pen@brand: null, color: GREEN, price: 0.0", penWithColor.toString());
    }

    @Test
    public void penWithColorAndPriceToStringShouldReturnTrue() {
        assertEquals("main.model.Pen@brand: null, color: BLUE, price: 178.456", penWithColorAndPrice.toString());
    }

    @Test
    public void penWithBrandColorPriceToStringShouldReturnTrue() {
        assertEquals("main.model.Pen@brand: brand, color: BLACK, price: 19.0", penWithBrandColorPrice.toString());
    }
}

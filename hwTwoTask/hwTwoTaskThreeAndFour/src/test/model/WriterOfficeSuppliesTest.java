package test.model;

import main.model.OfficeSupplies.OfficeSuppliesName;
import main.model.OfficeSupplies.WritingOfficeSupplies.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WriterOfficeSuppliesTest {
    private Pen nonAutoPen;
    private WritingOfficeSupplies pencil;

    @Before
    public void setUp() {
        nonAutoPen = new Pen(15, Ink.BALLPOINT, false);
        pencil = new Pencil(17, "HS");
    }

    @Test(expected = PenWithCapNotAutoPen.class)
    public void nonAutoPenWantToBeAutoShouldCatchException() throws PenWithCapNotAutoPen {
        nonAutoPen.setAutoPen();
    }

    @Test
    public void getNamePencilShouldReturnPencil() {
        assertEquals(OfficeSuppliesName.PENCIL, pencil.getNameOfficeSupplies());
    }

    @Test
    public void getNamePenShouldReturnPen() {
        assertEquals(OfficeSuppliesName.PEN, nonAutoPen.getNameOfficeSupplies());
    }

    @Test
    public void getFlagPenIsNonAutoShouldReturnFalse() {
        assertFalse(nonAutoPen.isAutoPen());
    }

}

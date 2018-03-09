package test.model;

import main.model.OfficeSupplies.MeasuringOfficeSupplies.MeasuringOfficeSupplies;
import main.model.OfficeSupplies.MeasuringOfficeSupplies.MeasuringOfficeSuppliesNotBroken;
import main.model.OfficeSupplies.MeasuringOfficeSupplies.Ruler;
import org.junit.Before;
import org.junit.Test;


public class MeasuringOfficeSuplierTest {
    private MeasuringOfficeSupplies ruler;

    @Before
    public void setUp() {
        ruler = new Ruler(15, 10, true);
    }

    @Test(expected = MeasuringOfficeSuppliesNotBroken.class)
    public void setLngthNotBrokenRulerShouldCatchException() throws MeasuringOfficeSuppliesNotBroken {
        ruler.setLength(10);
    }

}

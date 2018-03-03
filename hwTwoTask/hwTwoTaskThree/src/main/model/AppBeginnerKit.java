package main.model;

import java.util.ArrayList;

public class AppBeginnerKit {
    public static void main(String[] args) {
        ArrayList<OfficeSupplies> beginerKit = new ArrayList<>();

        OfficeSupplies penNotAuto = new Pen(10, Ink.CAPILLARY, false);
        OfficeSupplies penAuto = new Pen(10, Ink.CAPILLARY, true);
        WritingOfficeSupplies pencil = new Pencil(35);
        Marker marker = new Marker(45, 3);

        OfficeSupplies ruler = new Ruler(25.5, 17);
        MeasuringOfficeSupplies protractor = new Protractor(37, 18, 5);

        beginerKit.add(penNotAuto);
        beginerKit.add(penAuto);
        beginerKit.add(pencil);
        beginerKit.add(ruler);
        beginerKit.add(marker);
    }

}

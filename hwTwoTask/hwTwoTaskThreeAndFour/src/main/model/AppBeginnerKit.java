package main.model;

import main.model.OfficeSupplies.MeasuringOfficeSupplies.MeasuringOfficeSupplies;
import main.model.OfficeSupplies.MeasuringOfficeSupplies.Protractor;
import main.model.OfficeSupplies.MeasuringOfficeSupplies.Ruler;
import main.model.OfficeSupplies.OfficeSupplies;
import main.model.OfficeSupplies.OfficeSuppliesComparator;
import main.model.OfficeSupplies.WritingOfficeSupplies.*;

import java.util.*;

public class AppBeginnerKit {
    public static void main(String[] args) {
        Comparator<OfficeSupplies> comparator = new OfficeSuppliesComparator();
        Comparator<OfficeSupplies> comparatorByName = new OfficeSuppliesComparator.OfficeSuppliesComparatorByName();
        Comparator<OfficeSupplies> comparatorByPrice = new OfficeSuppliesComparator.OfficeSuppliesComparatorByPrice();


        List<OfficeSupplies> beginerKit = new ArrayList<OfficeSupplies>();

        OfficeSupplies penNotAuto = new Pen(10, Ink.CAPILLARY, false, WritingOfficeSupplies.Color.GREEN);
        OfficeSupplies penAuto = new Pen(11, Ink.CAPILLARY, true);
        WritingOfficeSupplies pencil = new Pencil(35);
        Marker marker = new Marker(45, 3);

        OfficeSupplies ruler = new Ruler(25.5, 17);
        MeasuringOfficeSupplies protractor = new Protractor(37, 18, 5);

        beginerKit.add(penNotAuto);
        beginerKit.add(penAuto);
        beginerKit.add(pencil);
        beginerKit.add(ruler);
        beginerKit.add(marker);
        beginerKit.add(protractor);

        Collections.sort(beginerKit, comparatorByName);
        System.out.println("After sort by name:");
        for (OfficeSupplies officeSupplies : beginerKit) {
            System.out.println(officeSupplies.toString());
        }

        System.out.println("After sort by price:");
        Collections.sort(beginerKit, comparatorByPrice);
        for (OfficeSupplies officeSupplies : beginerKit) {
            System.out.println(officeSupplies.toString());
        }
        System.out.println("After sort by price and name:");
        Collections.sort(beginerKit, comparator);
        for (OfficeSupplies officeSupplies : beginerKit) {
            System.out.println(officeSupplies.toString());
        }

    }

}

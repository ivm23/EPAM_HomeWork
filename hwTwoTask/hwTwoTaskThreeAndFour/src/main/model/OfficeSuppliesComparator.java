package main.model;

import java.util.Comparator;

public class OfficeSuppliesComparator implements Comparator<OfficeSupplies> {
    @Override
    public int compare(OfficeSupplies officeSupplies1, OfficeSupplies officeSupplies2) {
        OfficeSuppliesComparatorByName comparatorByName = new OfficeSuppliesComparatorByName();
        if (officeSupplies1.getPrice() < officeSupplies2.getPrice()) {
            return -1;
        } else if (officeSupplies1.getPrice() > officeSupplies2.getPrice()) {
            return 1;
        } else {
            return comparatorByName.compare(officeSupplies1, officeSupplies2);
        }
    }

    public static class OfficeSuppliesComparatorByName implements Comparator<OfficeSupplies>{
        @Override
        public int compare(OfficeSupplies officeSupplies1, OfficeSupplies officeSupplies2) {
            return officeSupplies1.getNameOfficeSupplies().toString().compareTo(officeSupplies2.getNameOfficeSupplies().toString());
        }
    }
    public static class OfficeSuppliesComparatorByPrice implements Comparator<OfficeSupplies>{
        @Override
        public int compare(OfficeSupplies officeSupplies1, OfficeSupplies officeSupplies2) {
            if (officeSupplies1.getPrice()  == officeSupplies2.getPrice() ) {
                return 0;
            } else {
                return (officeSupplies1.getPrice() < officeSupplies2.getPrice() ? -1 : 1);
            }
        }
    }



}

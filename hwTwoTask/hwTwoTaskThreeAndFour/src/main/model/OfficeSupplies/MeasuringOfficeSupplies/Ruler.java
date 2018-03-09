package main.model.OfficeSupplies.MeasuringOfficeSupplies;

import main.model.OfficeSupplies.OfficeSuppliesName;

public class Ruler extends MeasuringOfficeSupplies {
    private boolean feature;

    public Ruler(double price, double length) {
        super(price, length, OfficeSuppliesName.RULER);
    }

    public Ruler(double price, double length, boolean feature) {
        super(price, length, OfficeSuppliesName.RULER);
        this.feature = feature;
    }

    @Override
    public String toString() {
        StringBuilder infoAboutMeasuringOfficeSupplies = new StringBuilder("I'm ");
        infoAboutMeasuringOfficeSupplies.append(getNameOfficeSupplies());
        infoAboutMeasuringOfficeSupplies.append(" and I ");
        infoAboutMeasuringOfficeSupplies.append(feature ? "have feature" : "haven't feature");

        return infoAboutMeasuringOfficeSupplies.toString();
    }
}

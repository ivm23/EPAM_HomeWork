package main.model;

public class Ruler extends MeasuringOfficeSupplies {
    private boolean hasFeature;

    public Ruler(double price, double length) {
        super(price, length, OfficeSuppliesName.RULER);
    }

    public Ruler(double price, double length, boolean hasFeature) {
        super(price, length, OfficeSuppliesName.RULER);
        this.hasFeature = hasFeature;
    }

    @Override
    public String toString() {
        StringBuilder infoAboutMeasuringOfficeSupplies = new StringBuilder("I'm ");
        infoAboutMeasuringOfficeSupplies.append(getNameOfficeSupplies());
        infoAboutMeasuringOfficeSupplies.append(" and I");
        infoAboutMeasuringOfficeSupplies.append(hasFeature ? "have feature" : "haven't feature");

        return infoAboutMeasuringOfficeSupplies.toString();
    }
}

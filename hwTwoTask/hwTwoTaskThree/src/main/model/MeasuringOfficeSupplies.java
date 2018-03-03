package main.model;

public abstract class MeasuringOfficeSupplies extends OfficeSupplies {
    private double length;

    public MeasuringOfficeSupplies(double price, double length, OfficeSuppliesName officeSuppliesName) {
        super(price, officeSuppliesName);
        this.length = length;
    }

    public void setLength(boolean isBroken, double length) throws MeasuringOfficeSuppliesNotBroken {
        if (isBroken) {
            this.length = length;
        } else {
            throw new MeasuringOfficeSuppliesNotBroken(getNameOfficeSupplies());
        }
    }

    public double getLength() {
        return length;
    }

}

package main.model;

public abstract class MeasuringOfficeSupplies extends OfficeSupplies {
    private double length;
    private boolean isBroken;

    public MeasuringOfficeSupplies(double price, double length, OfficeSuppliesName officeSuppliesName) {
        super(price, officeSuppliesName);
        this.length = length;
    }

    public void setTrueIsBroken(){
        this.isBroken = true;
    }

    public void setLength(double length) throws MeasuringOfficeSuppliesNotBroken {
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

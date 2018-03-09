package main.model.OfficeSupplies.MeasuringOfficeSupplies;

import main.model.OfficeSupplies.OfficeSupplies;
import main.model.OfficeSupplies.OfficeSuppliesName;

public abstract class MeasuringOfficeSupplies extends OfficeSupplies {
    private double length;
    private boolean broken;

    public MeasuringOfficeSupplies(double price, double length, OfficeSuppliesName officeSuppliesName) {
        super(price, officeSuppliesName);
        this.length = length;
    }

    public void broke() {
        this.broken = true;
    }

    public void setLength(double length) throws MeasuringOfficeSuppliesNotBroken {
        if (broken) {
            this.length = length;
        } else {
            throw new MeasuringOfficeSuppliesNotBroken(getNameOfficeSupplies());
        }
    }

    public double getLength() {
        return length;
    }

}

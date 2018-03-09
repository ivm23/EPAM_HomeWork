package main.model.OfficeSupplies.MeasuringOfficeSupplies;

import main.model.OfficeSupplies.OfficeSuppliesName;

public class MeasuringOfficeSuppliesNotBroken extends Exception {
    private OfficeSuppliesName nameOfficeSupplies;

    public MeasuringOfficeSuppliesNotBroken(OfficeSuppliesName nameOfficeSupplies) {
        this.nameOfficeSupplies = nameOfficeSupplies;
    }

    @Override
    public String toString() {
        return "MeasuringOfficeSuppliesNotBroken[ " + nameOfficeSupplies + " is not broken]";
    }
}

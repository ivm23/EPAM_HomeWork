package main.model.OfficeSupplies.WritingOfficeSupplies;

import main.model.OfficeSupplies.OfficeSuppliesName;

public class PenWithCapNotAutoPen extends Exception {
    private OfficeSuppliesName nameOfficeSupplies;

    public PenWithCapNotAutoPen(OfficeSuppliesName nameOfficeSupplies) {
        this.nameOfficeSupplies = nameOfficeSupplies;
    }

    @Override
    public String toString() {
        return "PenWithCapNotAutoPen[ " + nameOfficeSupplies + " is not AutoPen]";
    }
}

package main.model;

public class PenWithCapNotAutoPen extends Exception {
    private OfficeSuppliesName nameOfficeSupplies;

    public PenWithCapNotAutoPen(OfficeSuppliesName nameOfficeSupplies) {
        this.nameOfficeSupplies = nameOfficeSupplies;
    }

    @Override
    public String toString(){
        return "PenWithCapNotAutoPen[ " + nameOfficeSupplies + " is not AutoPen]";
    }
}

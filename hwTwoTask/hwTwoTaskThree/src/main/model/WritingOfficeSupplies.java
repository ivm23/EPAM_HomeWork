package main.model;

public abstract class WritingOfficeSupplies extends OfficeSupplies {
    private Color color;

    public WritingOfficeSupplies(double price, OfficeSuppliesName officeSuppliesName) {
        super(price, officeSuppliesName);
        color = Color.NONE;
    }

    public WritingOfficeSupplies(double price, OfficeSuppliesName officeSuppliesName, Color color) {
        super(price, officeSuppliesName);
        this.color = color;
    }

}

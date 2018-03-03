package main.model;

public class Pen extends WritingOfficeSupplies {
    private Ink ink;
    private boolean isAutoPen;

    public Pen(double price) {
        super(price, OfficeSuppliesName.PEN);
        ink = Ink.NONE;
    }

    public Pen(double price, Ink ink) {
        super(price, OfficeSuppliesName.PEN);
        this.ink = ink;
    }

    public Pen(double price, Ink ink, boolean isAutoPen) {
        super(price, OfficeSuppliesName.PEN);
        this.ink = ink;
        this.isAutoPen = isAutoPen;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public boolean isAutoPen() {
        return isAutoPen;
    }

    public void setAutoPen() throws PenWithCapNotAutoPen {
        if (!isAutoPen) throw new PenWithCapNotAutoPen(getNameOfficeSupplies());
        isAutoPen = true;
    }
}

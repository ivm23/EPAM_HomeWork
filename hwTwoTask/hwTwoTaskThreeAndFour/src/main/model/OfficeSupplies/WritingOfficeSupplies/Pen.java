package main.model.OfficeSupplies.WritingOfficeSupplies;

import main.model.OfficeSupplies.OfficeSuppliesName;

public class Pen extends WritingOfficeSupplies {
    private Ink ink;
    private boolean autoPen;

    public Pen(double price) {
        super(price, OfficeSuppliesName.PEN);
        ink = Ink.NONE;
    }

    public Pen(double price, Ink ink) {
        super(price, OfficeSuppliesName.PEN);
        this.ink = ink;
    }

    public Pen(double price, Ink ink, boolean autoPen) {
        super(price, OfficeSuppliesName.PEN);
        this.ink = ink;
        this.autoPen = autoPen;
    }

    public Pen(double price, Ink ink, boolean autoPen, Color color) {
        super(price, OfficeSuppliesName.PEN, color);
        this.ink = ink;
        this.autoPen = autoPen;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public boolean isAutoPen() {
        return autoPen;
    }

    public void setAutoPen() throws PenWithCapNotAutoPen {
        if (!autoPen) {
            throw new PenWithCapNotAutoPen(getNameOfficeSupplies());
        }
        autoPen = true;
    }
}

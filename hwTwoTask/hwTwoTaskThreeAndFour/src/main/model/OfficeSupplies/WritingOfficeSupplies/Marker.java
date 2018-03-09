package main.model.OfficeSupplies.WritingOfficeSupplies;

import main.model.OfficeSupplies.OfficeSuppliesName;

public class Marker extends WritingOfficeSupplies {
    public int thickness;
    public boolean tinsel;

    public Marker(double price) {
        super(price, OfficeSuppliesName.MARKER);
        thickness = 1;
    }

    public Marker(double price, int thickness) {
        super(price, OfficeSuppliesName.MARKER);
        this.thickness = thickness;
    }

    public Marker(double price, int thickness, boolean tinsel) {
        super(price, OfficeSuppliesName.MARKER);
        this.thickness = thickness;
        this.tinsel = tinsel;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public boolean withTinsel() {
        return tinsel;
    }

    public void useMarker() {
        System.out.print(tinsel ? "I'm a magic marker!" : "I'm just a marker");
    }
}

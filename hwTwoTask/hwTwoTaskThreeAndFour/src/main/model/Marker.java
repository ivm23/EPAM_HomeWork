package main.model;

public class Marker extends WritingOfficeSupplies {
    public int thickness;
    public boolean withTinsel;

    public Marker(double price) {
        super(price, OfficeSuppliesName.MARKER);
        thickness = 1;
    }

    public Marker(double price, int thickness) {
        super(price, OfficeSuppliesName.MARKER);
        this.thickness = thickness;
    }

    public Marker(double price, int thickness, boolean withTinsel) {
        super(price, OfficeSuppliesName.MARKER);
        this.thickness = thickness;
        this.withTinsel = withTinsel;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public boolean getIsWithTinsel() {
        return withTinsel;
    }

    public void useMarker() {
        System.out.print(withTinsel ? "I'm a magic marker!" : "I'm just a marker");
    }
}

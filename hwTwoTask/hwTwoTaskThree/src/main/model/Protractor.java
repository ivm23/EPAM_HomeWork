package main.model;

public class Protractor extends MeasuringOfficeSupplies {
    private double radius;

    public Protractor(double price, double length) {
        super(price, length, OfficeSuppliesName.PROTRACTOR);
    }

    public Protractor(double price, double length, double radius) {
        super(price, length, OfficeSuppliesName.PROTRACTOR);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

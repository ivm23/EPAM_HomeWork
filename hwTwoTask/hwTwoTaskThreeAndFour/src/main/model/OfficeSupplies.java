package main.model;

import java.util.Comparator;

public abstract class OfficeSupplies {

    private OfficeSuppliesName officeSuppliesName;

    private double price;

    public OfficeSupplies(double price, OfficeSuppliesName officeSuppliesName) {
        this.officeSuppliesName = officeSuppliesName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public OfficeSuppliesName getNameOfficeSupplies() {
        return officeSuppliesName;
    }



}


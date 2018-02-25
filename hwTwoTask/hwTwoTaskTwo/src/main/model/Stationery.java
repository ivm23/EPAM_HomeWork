package main.model;

public abstract class Stationery {
    private int price;
    private String brand;

    public Stationery() {
        brand = "";
    }
    public Stationery(int price) {
        this.price = price;
        brand = "";
    }
    public Stationery(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public boolean equals(Object object) {

        if (null == object) {
            return false; // ненулевая ссылка
        }
        if (this == object) {
            return true; // рефлексивность
        }
        if (getClass() != object.getClass()) {
            return false;
        }

        Stationery stationery = (Stationery) object;

        if (price != stationery.price) {
            return false;
        }
        if (null == brand || null == stationery.brand && brand == stationery.brand) {
            return true;
        }
        return (brand.equals(stationery.brand));
    }
}

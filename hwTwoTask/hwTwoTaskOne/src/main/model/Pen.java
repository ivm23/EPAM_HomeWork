package main.model;

public class Pen {
    private String brand;
    private Color color;
    private double price;

    public Pen() {
        color = Color.UNKNOWN;
    }

    public Pen(Color color) {
        this.color = color;
    }

    public Pen(Color color, double price) {
        this.color = color;
        this.price = price;
    }

    public Pen(String brand, Color color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
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

        Pen pen = (Pen) object;

        if (price != pen.price || color != pen.color) {
            return false;
        }
        if (null == brand || null == pen.brand && brand == pen.brand) {
            return true;
        }
        return (brand.equals(pen.brand));
    }

    @Override
    public int hashCode() {
        return (int) (17 * Math.floor(price) + (null == brand ? 0 : brand.hashCode()) + color.hashCode());
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + "brand: " + brand+ ", color: " + color  + ", price: " + price;
    }
}

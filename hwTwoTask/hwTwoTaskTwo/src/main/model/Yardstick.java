package main.model;

public class Yardstick extends Stationery {
    private double length;

    public Yardstick() {
    }

    public Yardstick(double length) {
        this.length = length;
    }

    public Yardstick(int price) {
        super(price);
    }

    public Yardstick(int price, double length) {
        super(price);
        this.length = length;
    }

    public Yardstick(int price, String brand) {
        super(price, brand);
    }

    public Yardstick(int price, String brand, double length) {
        super(price, brand);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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

        Yardstick yardstick = (Yardstick) object;

        if (length != yardstick.length) {
            return false;
        }
        return super.equals(object);
    }
}

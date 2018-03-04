package main.model;

public class Pen extends Stationery {
    private Color color;

    public Pen() {
        color = Color.NONE;
    }

    public Pen(Color color) {
        this.color = color;
    }

    public Pen(int price) {
        super(price);
        color = Color.NONE;
    }

    public Pen(int price, Color color) {
        super(price);
        this.color = color;
    }

    public Pen(int price, String brand) {
        super(price, brand);
        color = Color.NONE;
    }

    public Pen(int price, String brand, Color color) {
        super(price, brand);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

        if (color != pen.color) {
            return false;
        }
        return super.equals(object);
    }
}

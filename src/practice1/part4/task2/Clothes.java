package practice1.part4.task2;

public abstract class Clothes {
    protected Size size;
    protected double price;
    protected String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() { return size; }
    public double getPrice() { return price; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
package practice2.part1;

public class Computer implements Priceable, Nameable {
    private String name;
    private double price;

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{name='" + name + "', price=" + price + "}";
    }
}
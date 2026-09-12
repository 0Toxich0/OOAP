package practice1.part4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: " + this);
    }
}
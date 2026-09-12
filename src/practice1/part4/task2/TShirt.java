package practice1.part4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: " + this);
    }
}

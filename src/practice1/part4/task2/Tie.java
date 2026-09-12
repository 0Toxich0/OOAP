package practice1.part4.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук: " + this);
    }
}
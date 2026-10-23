package practice2.part1;

public class Shop implements Printable {
    String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Магазин '%s'\n", name);
    }
}
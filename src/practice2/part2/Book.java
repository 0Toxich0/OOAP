package practice2.part2;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + name);
    }

    // задание 8
    public static void printBooks(Printable[] printables) {
        System.out.println("Список книг");
        for (Printable p : printables) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
}
package practice2.part1;

public class TestMovable {
    public static void main(String[] args) {
        // --- Задания 1–5: Movable ---
        System.out.println("=== Movable ===");
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("До: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("После: " + point);

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("До: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("После: " + circle);

        MovableRectangle rect = new MovableRectangle(0, 10, 10, 0, 2, 2);
        System.out.println("До: " + rect);
        rect.moveUp();
        rect.moveRight();
        System.out.println("После: " + rect);

        // --- Задания 6–9: Printable ---
        System.out.println("\n=== Printable ===");
        Printable[] printables = {
                new Book("Java. Полное руководство"),
                new Shop("DNS"),
                new Book("Чистый код"),
                new Shop("М.Видео")
        };
        for (Printable p : printables) {
            p.print();
        }

        // --- Задание 10: Интернет-магазин ---
        System.out.println("\n=== Интернет-магазин ===");
        Computer comp1 = new Computer("Ноутбук ASUS", 75000);
        Computer comp2 = new Computer("Монитор Dell", 25000);
        System.out.println(comp1.getName() + " — " + comp1.getPrice() + " руб.");
        System.out.println(comp2.getName() + " — " + comp2.getPrice() + " руб.");
    }
}
package practice2.part1;

public class TestMovable {
    public static void main(String[] args) {
        System.out.println("Задания 1-5: Movable");
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        point.moveUp();
        point.moveRight();
        System.out.println("Точка: " + point);

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        circle.moveDown();
        System.out.println("Круг: " + circle);

        MovableRectangle rect = new MovableRectangle(0, 10, 10, 0, 2, 2);
        System.out.println("Скорости совпадают? " + rect.checkSpeed());

        System.out.println("\nЗадания 6-9: Printable");
        Printable[] printables = {
                new Book("Война и мир", "Л.Н. Толстой", 1863),
                new Shop("DNS"),
                new Book("Отцы и дети", "И. Тургенев", 1862)
        };
        for (Printable p : printables) {
            p.print();
        }

        System.out.println("\nЗадание 10: Computer");
        Computer comp = new Computer("Ноутбук ASUS", 75000);
        System.out.println(comp.getName() + " — " + comp.getPrice() + " руб.");
    }
}
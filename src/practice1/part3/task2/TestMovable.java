package practice1.part3.task2;

public class TestMovable {
    public static void main(String[] args) {
        // Точка
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Точка до: " + p);
        p.moveUp();
        p.moveRight();
        System.out.println("Точка после: " + p);

        // Круг
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("Круг до: " + c);
        c.moveDown();
        c.moveLeft();
        System.out.println("Круг после: " + c);

        // Прямоугольник
        MovableRectangle rect = new MovableRectangle(0, 0, 10, 10, 2, 2);
        System.out.println("Прямоугольник до: " + rect);
        System.out.println("Скорости совпадают? " + rect.checkSpeed());
        rect.moveRight();
        System.out.println("Прямоугольник после: " + rect);
    }
}
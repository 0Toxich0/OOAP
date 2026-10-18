package practice1.add;

public class Rectangle {
    private double width;
    private double height;

    // безаргументный конструктор
    public Rectangle() {
        this.width = -1;
        this.height = -1;
    }

    // конструктор с параметрами
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // метод для площади
    public double getArea() {
        return width * height;
    }

    // метод для периметра
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // геттеры
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
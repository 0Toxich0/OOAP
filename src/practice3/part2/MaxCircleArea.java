package practice3.part2;

class Circle {
    double radius;
    public Circle(double radius) { this.radius = radius; }
    public double getArea() { return Math.PI * radius * radius; }
}

public class MaxCircleArea {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random() * 100);
        }

        Circle maxCircle = circles[0];
        for (Circle c : circles) {
            if (c.getArea() > maxCircle.getArea()) {
                maxCircle = c;
            }
        }
        System.out.printf("Максимальная площадь: %.2f (радиус: %.2f)\n", maxCircle.getArea(), maxCircle.radius);
    }
}
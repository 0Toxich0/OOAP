package practice3.part1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;
    public Shape(Color color, int x, int y) {
        this.color = color; this.x = x; this.y = y;
    }
    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;
    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y); this.radius = radius;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}

class Rect extends Shape {
    private int w, h;
    public Rect(Color color, int x, int y, int w, int h) {
        super(color, x, y); this.w = w; this.h = h;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }
}

public class RandomShapes extends JFrame {
    public RandomShapes() {
        setTitle("Random Shapes");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new ShapesPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RandomShapes().setVisible(true);
            }
        });
    }
}

class ShapesPanel extends JPanel {
    private Shape[] shapes = new Shape[20];

    public ShapesPanel() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Color c = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(700);
            int y = rand.nextInt(500);
            if (rand.nextBoolean()) {
                shapes[i] = new Circle(c, x, y, rand.nextInt(100) + 20);
            } else {
                shapes[i] = new Rect(c, x, y, rand.nextInt(100) + 20, rand.nextInt(100) + 20);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
    }
}
package practice1.part3.task2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean checkSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public void moveUp() {
        if (!checkSpeed()) {
            System.out.println("Скорости не совпадают");
            return;
        }
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if (!checkSpeed()) {
            System.out.println("Скорости не совпадают");
            return;
        }
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (!checkSpeed()) {
            System.out.println("Скорости не совпадают");
            return;
        }
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (!checkSpeed()) {
            System.out.println("Скорости не совпадают");
            return;
        }
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
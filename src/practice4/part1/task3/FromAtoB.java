package practice4.part1.task3;

public class FromAtoB {
    public static void main(String[] args) {
        System.out.println("От 5 до 8:");
        printRange(5, 8);
        System.out.println("\nОт 8 до 5:");
        printRange(8, 5);
    }

    public static void printRange(int a, int b) {
        System.out.print(a + " ");
        if (a == b) {
            return;
        }
        if (a < b) {
            printRange(a + 1, b);
        } else {
            printRange(a - 1, b);
        }
    }
}
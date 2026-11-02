package practice4.part1.task2;

public class FromOneToN {
    public static void main(String[] args) {
        printFromOneToN(5);
    }

    public static void printFromOneToN(int n) {
        if (n > 0) {
            printFromOneToN(n - 1);
            System.out.print(n + " ");
        }
    }
}
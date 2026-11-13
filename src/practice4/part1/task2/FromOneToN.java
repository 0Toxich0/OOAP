package practice4.part1.task2;

public class FromOneToN {
    public static void main(String[] args) {
        printFromOneToN(5);
    }

    public static void printFromOneToN(int n) {
        // базовый случай если n=0 то стоп
        if (n > 0) {
            // печатаем при возврате
            printFromOneToN(n - 1);
            System.out.print(n + " ");
        }
    }
}
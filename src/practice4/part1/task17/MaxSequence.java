package practice4.part1.task17;

import java.util.Scanner;

public class MaxSequence {
    // статический сканер тк запрет на параметры
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вводите числа (0 для завершения):");
        System.out.println("Максимальное значение: " + findMax());
    }

    public static int findMax() {
        int n = scanner.nextInt();

        // встреча 0 стоп
        if (n == 0) {
            return 0;
        }

        // максимум в остатке
        int maxRest = findMax();

        // возврат большее из двух
        return Math.max(n, maxRest);
    }
}
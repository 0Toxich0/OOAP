package practice4.part1.task16;

import java.util.Scanner;

public class MaxCount {
    // сканер статический потому что нельзя передавать параметры
    static Scanner scanner = new Scanner(System.in);

    // класс для возвращения значения максимума и сколько раз
    static class Result {
        int max;
        int count;
    }

    public static void main(String[] args) {
        System.out.println("Вводите числа (0 для завершения):");
        Result res = findMaxAndCount();
        System.out.println("Максимум: " + res.max);
        System.out.println("Количество элементов, равных максимуму: " + res.count);
    }

    public static Result findMaxAndCount() {
        int n = scanner.nextInt();

        // базовый случай встретили 0
        if (n == 0) {
            Result r = new Result();
            r.max = 0;
            r.count = 0;
            return r;
        }

        // рекурсия для остатка
        Result rest = findMaxAndCount();
        Result current = new Result();

        // сравнение текущего с максимумом из остатка
        if (n > rest.max) {
            current.max = n;
            current.count = 1;
        } else if (n == rest.max) {
            // еще 1 такое же число увелич счетчик
            current.max = n;
            current.count = rest.count + 1; // еще 1 максимум
        } else {
            current.max = rest.max;
            current.count = rest.count;
        }

        return current;
    }
}
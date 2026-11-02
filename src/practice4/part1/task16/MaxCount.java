package practice4.part1.task16;

import java.util.Scanner;

public class MaxCount {
    static Scanner scanner = new Scanner(System.in);

    // возврат максимум и количество
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

    // функция без параметров с клавиатуры
    public static Result findMaxAndCount() {
        int n = scanner.nextInt();

        // базовый
        if (n == 0) {
            Result r = new Result();
            r.max = 0;
            r.count = 0;
            return r;
        }

        // рекурсия остаток последовательности
        Result rest = findMaxAndCount();
        Result current = new Result();

        // текущее число с максимумом из остатка
        if (n > rest.max) {
            current.max = n;
            current.count = 1;
        } else if (n == rest.max) {
            current.max = n;
            current.count = rest.count + 1;
        } else {
            current.max = rest.max;
            current.count = rest.count;
        }

        return current;
    }
}
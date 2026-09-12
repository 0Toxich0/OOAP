package practice1.part1;

public class FactorialCalculator {
    // вычисления факториала
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определён только для неотрицательных чисел");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // проверка метода
        int[] testNumbers = {0, 1, 5, 7, 10};
        for (int num : testNumbers) {
            System.out.println(num + "! = " + factorial(num));
        }
    }
}
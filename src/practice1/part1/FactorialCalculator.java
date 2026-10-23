package practice1.part1;

public class FactorialCalculator {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testNumbers = {0, 1, 5, 7, 10};
        for (int num : testNumbers) {
            System.out.println(num + "! = " + factorial(num));
        }
    }
}
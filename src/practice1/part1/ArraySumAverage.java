package practice1.part1;

public class ArraySumAverage {
    public static void main(String[] args) {
        // инициализация массива
        int[] numbers = {5, 12, 7, 3, 9, 21, 4, 8, 15, 6};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
package practice1.part1;

import java.util.Scanner;

public class ArrayInputStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть больше 0.");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // сумма while
        int sumWhile = 0;
        int i = 0;
        while (i < arr.length) {
            sumWhile += arr[i];
            i++;
        }

        // сумма do-while
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += arr[j];
            j++;
        } while (j < arr.length);

        // максимум и минимум
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do-while): " + sumDoWhile);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
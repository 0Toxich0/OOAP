package practice2.add;

import java.util.Random;

public class RandomTask {
    public static void main(String[] args) {
        System.out.println("Задание №4: Класс Random");

        Random rand = new Random(1000);

        System.out.println("Первые 50 случайных чисел (0-100):");
        for (int i = 0; i < 50; i++) {
            System.out.print(rand.nextInt(100) + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println(); // Перенос строки каждые 10 чисел
            }
        }
    }
}
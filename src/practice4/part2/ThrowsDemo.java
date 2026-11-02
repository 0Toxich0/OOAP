package practice4.part2;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            try {
                System.out.print("Введите ключ: ");
                String key = myScanner.nextLine();
                printDetails(key);
                success = true;
            } catch (NullPointerException e) {
                System.out.println("Ошибка: " + e.getMessage() + ". Попробуйте снова.");
            }
        }
    }

    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) {
        if (key == null || key.isEmpty()) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        new ThrowsDemo().getKey();
    }
}
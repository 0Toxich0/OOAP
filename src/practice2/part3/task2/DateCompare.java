package practice2.part3.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.print("Введите дату и время (dd.MM.yyyy HH:mm): ");
        String input = scanner.nextLine();

        try {
            Date userDate = sdf.parse(input);
            Date currentDate = new Date();

            System.out.println("Текущая дата/время: " + sdf.format(currentDate));
            System.out.println("Введённая дата/время: " + sdf.format(userDate));

            int cmp = userDate.compareTo(currentDate);
            if (cmp < 0) {
                System.out.println("Введённая дата раньше текущей.");
            } else if (cmp > 0) {
                System.out.println("Введённая дата позже текущей.");
            } else {
                System.out.println("Даты совпадают.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты.");
        }
    }
}
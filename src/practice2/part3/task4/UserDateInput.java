package practice2.part3.task4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserDateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год, месяц (1-12), день, часы и минуты:");
        int year = scanner.nextInt();
        int month = scanner.nextInt() - 1; // в Calendar месяцы с 0
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date date = calendar.getTime();

        System.out.println("Объект Calendar: " + calendar.getTime());
        System.out.println("Объект Date:     " + date);
    }
}
package practice2.add;

import java.util.GregorianCalendar;

public class GregorianCalendarTask {
    public static void main(String[] args) {
        System.out.println("Задание №5: Класс GregorianCalendar");

        GregorianCalendar cal = new GregorianCalendar();

        // вывод текущей даты
        System.out.println("1. Текущая дата:");
        System.out.println("   Год: " + cal.get(GregorianCalendar.YEAR));
        System.out.println("   Месяц: " + (cal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("   День: " + cal.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println();

        // установка времени
        cal.setTimeInMillis(1234567898765L);
        System.out.println("2. Дата для времени 1234567898765L мс:");
        System.out.println("   Год: " + cal.get(GregorianCalendar.YEAR));
        System.out.println("   Месяц: " + (cal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("   День: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
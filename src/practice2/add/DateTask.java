package practice2.add;

import java.util.Date;

public class DateTask {
    public static void main(String[] args) {
        System.out.println("Задание №3: Класс Date");

        long[] millis = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                100000000000L
        };

        for (long m : millis) {
            Date date = new Date(m);
            System.out.println(m + " мс -> " + date.toString());
        }
    }
}
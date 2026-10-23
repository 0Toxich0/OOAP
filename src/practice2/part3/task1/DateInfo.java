package practice2.part3.task1;

import java.util.Date;

public class DateInfo {
    public static void main(String[] args) {
        String developer = "Иванов Иван Иванович";

        // дата и время получения
        Date receivedDate = new Date(); // теперь это java.util.Date

        // дата сдачи 7 дней
        long sevenDaysInMillis = 7L * 24 * 60 * 60 * 1000;
        Date submittedDate = new Date(System.currentTimeMillis() + sevenDaysInMillis);

        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Задание получено: " + receivedDate);
        System.out.println("Задание сдано: " + submittedDate);
    }
}
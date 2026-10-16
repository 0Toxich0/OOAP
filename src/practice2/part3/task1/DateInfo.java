package practice2.part3.task1;

import java.util.Date; // стандартный класс

public class DateInfo { // имя изменено
    public static void main(String[] args) {
        String developer = "Иванов Иван Иванович"; // объявили переменную

        // Дата и время получения задания
        Date receivedDate = new Date(); // теперь это java.util.Date

        // Дата сдачи — через 7 дней
        long sevenDaysInMillis = 7L * 24 * 60 * 60 * 1000;
        Date submittedDate = new Date(System.currentTimeMillis() + sevenDaysInMillis);

        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Задание получено: " + receivedDate);
        System.out.println("Задание сдано: " + submittedDate);
    }
}
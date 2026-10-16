package practice2.part3.task3;

import java.text.DateFormat;
import java.util.Date;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Петров Пётр", new Date());

        System.out.println(student);
        System.out.println("Короткий формат: " + student.getFormattedBirthDate(DateFormat.SHORT));
        System.out.println("Средний формат: " + student.getFormattedBirthDate(DateFormat.MEDIUM));
        System.out.println("Полный формат:  " + student.getFormattedBirthDate(DateFormat.FULL));
    }
}
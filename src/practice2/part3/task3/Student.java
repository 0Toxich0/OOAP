package practice2.part3.task3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Метод возвращает строку с датой рождения в заданном стиле
    public String getFormattedBirthDate(int style) {
        DateFormat df = DateFormat.getDateInstance(style, Locale.getDefault());
        return df.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', birthDate=" + birthDate + '}';
    }
}
package practice1.part2;

public class Author {
    // Поля класса
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Сеттер
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " (" + Character.toLowerCase(gender) + ") at " + email;
    }
}
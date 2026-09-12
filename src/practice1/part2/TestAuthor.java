package practice1.part2;

public class TestAuthor {
    public static void main(String[] unusedArgs) {
        // создание двух авторов
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        Author author2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');

        // вывод на экран
        System.out.println("Информация об авторе 1:");
        System.out.println(author1);

        System.out.println("\nИнформация об авторе 2:");
        System.out.println(author2);

        // меняется email у первого автора
        author1.setEmail("new.email@domain.com");
        System.out.println("\nПосле смены email у автора 1:");
        System.out.println(author1);

        // отдельные геттеры
        System.out.println("\nПроверка геттеров для автора 2:");
        System.out.println("Имя: " + author2.getName());
        System.out.println("Пол (символ): " + author2.getGender());
        System.out.println("Email: " + author2.getEmail());
    }
}
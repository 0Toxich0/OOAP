package practice2.part2;

public class TestMovable {
    public static void main(String[] args) {
        // задания 1-3
        System.out.println("Задания 1-3: Movable");
        MovableRectangle rect = new MovableRectangle(0, 10, 10, 0, 2, 2);
        System.out.println("До: " + rect);
        System.out.println("Скорости одинаковые? " + rect.SpeedTest());
        rect.moveUp();
        rect.moveRight();
        System.out.println("После: " + rect);

        // задание 4
        System.out.println("\nЗадание 4: MathCalculable");
        MathCalculable mc1 = new MathFunc(); // Правильно
        // MathCalculable mc2 = new MathCalculable(); // Ошибка - нельзя создать экземпляр интерфейса
        MathFunc mathFunc = new MathFunc();

        System.out.println("2 в степени 10: " + mc1.power(2, 10));
        System.out.println("Модуль комплексного числа (3, 4): " + mc1.modulus(3, 4));
        System.out.println("Длина окружности радиусом 5: " + mathFunc.circumference(5));
        System.out.println("Число PI из интерфейса: " + MathCalculable.PI);

        // задания 5-6
        System.out.println("\nЗадания 5-6: StringProcessor");
        ProcessStrings ps = new ProcessStrings();
        String testStr = "Программирование";
        System.out.println("Исходная строка: " + testStr);
        System.out.println("Количество символов: " + ps.countChars(testStr));
        System.out.println("Символы на нечетных позициях: " + ps.getOddChars(testStr));
        System.out.println("Инвертированная строка: " + ps.reverse(testStr));

        // задания 7-8
        System.out.println("\nЗадания 7-8: Printable");
        Printable[] printables = {
                new Book("Война и мир"),
                new Magazine("Хакер"),
                new Book("Отцы и дети"),
                new Magazine("Форбс")
        };

        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
package practice1.add;

public class TestA {
    public static void main(String[] args) {
        // ОБЪЯСНЕНИЕ ОШИБКИ
        // в классе A был только один конструктор A(String newS)
        // была строка new A() без параметров компилятор выдавал ошибку
        // так как конструктора без параметров (по умолчанию) в классе нет
        A a = new A("Ошибка исправлена!");
        a.print();
    }
}
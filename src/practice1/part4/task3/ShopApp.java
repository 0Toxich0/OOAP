package practice1.part4.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        // массивы
        String[] catalogs = {"Электроника", "Одежда", "Книги"};
        String[][] products = {
                {"Ноутбук", "Смартфон", "Наушники"},
                {"Футболка", "Джинсы", "Куртка"},
                {"Роман", "Учебник", "Словарь"}
        };

        ArrayList<String> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в интернет-магазин!");
        System.out.print("Логин: ");
        String login = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();

        if (!login.equals("admin") || !password.equals("123")) {
            System.out.println("Неверный логин или пароль. Выход.");
            return;
        }
        System.out.println("Успешный вход!");

        int choice = -1;
        while (choice != 0) {
            System.out.println("\nМеню:");
            System.out.println("1. Каталоги");
            System.out.println("2. Товары каталога");
            System.out.println("3. В корзину");
            System.out.println("4. Показать корзину");
            System.out.println("5. Купить");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера после ввода

            if (choice == 1) {
                for (int i = 0; i < catalogs.length; i++) {
                    System.out.println("- " + catalogs[i]);
                }
            } else if (choice == 2) {
                System.out.print("Введите название каталога: ");
                String cat = scanner.nextLine();
                boolean found = false;
                for (int i = 0; i < catalogs.length; i++) {
                    if (catalogs[i].equalsIgnoreCase(cat)) {
                        for (int j = 0; j < products[i].length; j++) {
                            System.out.println("  " + products[i][j]);
                        }
                        found = true;
                    }
                }
                if (!found) System.out.println("Каталог не найден.");
            } else if (choice == 3) {
                System.out.print("Введите название товара: ");
                String item = scanner.nextLine();
                cart.add(item);
                System.out.println("Товар добавлен в корзину.");
            } else if (choice == 4) {
                if (cart.isEmpty()) {
                    System.out.println("Корзина пуста.");
                } else {
                    System.out.println("Ваша корзина: " + cart);
                }
            } else if (choice == 5) {
                if (cart.isEmpty()) {
                    System.out.println("Корзина пуста. Нечего покупать.");
                } else {
                    System.out.println("Вы купили: " + cart);
                    cart.clear();
                    System.out.println("Спасибо за покупку!");
                }
            } else if (choice == 0) {
                System.out.println("Выход из магазина.");
            } else {
                System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }
    }
}
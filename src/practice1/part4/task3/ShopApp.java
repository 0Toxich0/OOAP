package practice1.part4.task3;

import java.util.*;

public class ShopApp {
    // каталоги товаров
    private static final Map<String, List<String>> catalog = new LinkedHashMap<>();
    private static final List<String> cart = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean loggedIn = false;

    static {
        catalog.put("Электроника", Arrays.asList("Ноутбук", "Смартфон", "Наушники"));
        catalog.put("Одежда", Arrays.asList("Футболка", "Джинсы", "Куртка"));
        catalog.put("Книги", Arrays.asList("Роман", "Учебник", "Словарь"));
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в интернет-магазин!");
        // Аутентификация
        if (!authenticate()) {
            System.out.println("Неверный логин или пароль. Выход.");
            return;
        }
        loggedIn = true;
        System.out.println("Успешный вход!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Просмотреть каталоги");
            System.out.println("2. Просмотреть товары в каталоге");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Показать корзину");
            System.out.println("5. Оформить покупку");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    showCatalogs();
                    break;
                case 2:
                    showProductsInCatalog();
                    break;
                case 3:
                    addToCart();
                    break;
                case 4:
                    showCart();
                    break;
                case 5:
                    checkout();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }
        System.out.println("Спасибо за покупку!");
    }

    private static boolean authenticate() {
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        // логин admin, пароль 123
        return "admin".equals(login) && "123".equals(password);
    }

    private static void showCatalogs() {
        System.out.println("Каталоги:");
        for (String name : catalog.keySet()) {
            System.out.println(" - " + name);
        }
    }

    private static void showProductsInCatalog() {
        System.out.print("Введите имя каталога: ");
        String name = scanner.nextLine();
        List<String> products = catalog.get(name);
        if (products == null) {
            System.out.println("Каталог не найден.");
        } else {
            System.out.println("Товары в каталоге \"" + name + "\":");
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i));
            }
        }
    }

    private static void addToCart() {
        System.out.print("Введите название товара: ");
        String product = scanner.nextLine();
        // есть ли такой товар хотя бы в одном каталоге
        boolean found = catalog.values().stream().anyMatch(list -> list.contains(product));
        if (found) {
            cart.add(product);
            System.out.println("Товар \"" + product + "\" добавлен в корзину.");
        } else {
            System.out.println("Товар не найден.");
        }
    }

    private static void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("Ваша корзина:");
            for (String item : cart) {
                System.out.println(" - " + item);
            }
        }
    }

    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста. Нечего покупать.");
        } else {
            System.out.println("Вы купили: " + cart);
            cart.clear();
            System.out.println("Спасибо за покупку!");
        }
    }
}
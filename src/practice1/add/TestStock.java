package practice1.add;

public class TestStock {
    public static void main(String[] args) {
        // объект акций
        Stock stock = new Stock("SBER", "ПАО Сбербанк");

        // стоимость на момент закрытия предыдущего дня
        stock.setPreviousClosingPrice(281.50);

        // новая стоимость в настоящий момент
        stock.setCurrentPrice(282.87);

        // вывод
        System.out.println("Акции: " + stock.getName() + " (" + stock.getSymbol() + ")");
        System.out.printf("Изменение стоимости: %.2f%%\n", stock.getChangePercent());
    }
}
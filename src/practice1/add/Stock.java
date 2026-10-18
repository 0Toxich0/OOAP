package practice1.add;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // конструктор создает акции с указанными обозначением и наименованием
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // геттеры и сеттеры для цен
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // метод возвращает процент изменения стоимости
    public double getChangePercent() {
        // Формула: ((Новая цена - Старая цена) / Старая цена) * 100
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // вывод
    public String getSymbol() { return symbol; }
    public String getName() { return name; }
}
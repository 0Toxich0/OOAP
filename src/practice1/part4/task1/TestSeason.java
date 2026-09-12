package practice1.part4.task1;

public class TestSeason {
    public static void main(String[] args) {
        // любимое время года
        Season favorite = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favorite);

        // метод принимающий Season и выводящий сообщение через switch
        printSeasonMessage(Season.WINTER);
        printSeasonMessage(Season.SUMMER);

        // все времена года с температурой и описанием
        System.out.println("\nВсе времена года:");
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
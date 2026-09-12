package practice1.part1;

public class HarmonicSeries {
    public static void main(String[] unusedArgs) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double value = 1.0 / i;
            System.out.printf("%2d-й член: %.10f%n", i, value);
        }
    }
}
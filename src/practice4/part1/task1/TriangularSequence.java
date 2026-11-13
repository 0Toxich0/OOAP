package practice4.part1.task1;

public class TriangularSequence {
    public static void main(String[] args) {
        printTriangular(10);
    }

    public static void printTriangular(int n) {
        int count = 0;            // сколько уже вывели
        int number = 1;           // текущее число
        int printedForNumber = 0; // сколько раз его вывели

        for (int i = 0; i < n; i++) {
            System.out.print(number + " ");
            printedForNumber++;

            // если напечатали число нужное количество раз берем следующее
            if (printedForNumber == number) {
                number++;
                printedForNumber = 0;
            }
        }
    }
}
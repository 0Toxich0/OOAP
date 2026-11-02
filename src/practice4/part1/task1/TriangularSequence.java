package practice4.part1.task1;

public class TriangularSequence {
    public static void main(String[] args) {
        printTriangular(10);
    }

    public static void printTriangular(int n) {
        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 1; j <= i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
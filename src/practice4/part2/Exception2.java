package practice4.part2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не целое число (NumberFormatException)");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль (ArithmeticException)");
        } catch (Exception e) {
            System.out.println("Произошло какое-то другое исключение");
        } finally {
            System.out.println("Блок finally выполнен.");
        }
    }

    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}
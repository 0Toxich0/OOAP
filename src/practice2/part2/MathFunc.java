package practice2.part2;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double modulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // пример вычисление длины окружности
    public double circumference(double radius) {
        return 2 * PI * radius;
    }
}
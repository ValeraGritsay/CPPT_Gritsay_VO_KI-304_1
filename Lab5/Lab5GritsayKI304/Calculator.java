package Lab5GritsayKI304;

/**
 * Клас Calculator надає можливість обчислити вираз для заданого числа x.
 */
public class Calculator {
    /**
     * Метод обчислює значення виразу cos(x) / sin(x) для заданого числа x.
     *
     * @param x Число, для якого потрібно обчислити вираз.
     * @return Результат обчислення виразу cos(x) / sin(x).
     * @throws IllegalArgumentException Якщо sin(x) дорівнює нулю.
     */
    public static double calculateExpression(double x) {
        if (Math.sin(x) == 0) {
            throw new IllegalArgumentException("sin(x) не може бути рівним нулю.");
        }

        return Math.cos(x) / Math.sin(x);
    }
}

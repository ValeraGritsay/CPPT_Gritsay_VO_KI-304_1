package Lab5GritsayKI304;

import java.io.IOException;

/**
 * Головний клас для обчислення та запису результату в файли.
 */
public class Main {
    public static void main(String[] args) {
        double x = 10; // Задайте значення x, для якого ви хочете обчислити вираз
        try {
            double result = Calculator.calculateExpression(x);

            // Записати результат у текстовий файл
            String txtFile = "result.txt";
            CalculatorResult.writeText(result, txtFile);
            System.out.println("Значення X :"+ x);
            System.out.println("Результат : "+ result);
            System.out.println("Результат був записаний у текстовий файл " + txtFile);

            // Записати результат у бінарний файл
            String binFile = "result.bin";
            CalculatorResult.writeBinary(result, binFile);
            System.out.println("Результат був записаний у бінарний файл " + binFile);
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}

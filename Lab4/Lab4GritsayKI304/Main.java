package Lab4GritsayKI304;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        double x = 10; // Задайте значення x, для якого ви хочете обчислити вираз
        try {
            double result = Calculator.calculateExpression(x);

            // Записати результат у файл
            File outputFile = new File("result.txt");
            FileWriter writer = new FileWriter(outputFile);
            writer.write("Результат обчислення для x = " + x + ": " + result);
            writer.close();
            System.out.println("Результат був записаний у файл result.txt.");
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}

package Lab5GritsayKI304; // Зверніть увагу на виправлену назву пакету

import java.io.*;

/**
 * Клас `CalculatorResult` надає методи для запису та зчитування результатів обчислень у текстовому та бінарному форматах.
 */
public class CalculatorResult {
    /**
     * Записує результат обчислень у текстовий файл.
     *
     * @param result  Результат обчислення для запису.
     * @param txtFile Ім'я текстового файлу, в який записуватиметься результат.
     * @throws IOException Якщо виникає помилка під час запису в файл.
     */
    public static void writeText(double result, String txtFile) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(txtFile))) {
            writer.println("Результат: " + result);
        }
    }

    /**
     * Зчитує результат обчислень з текстового файлу.
     *
     * @param txtFile Ім'я текстового файлу, з якого зчитуватиметься результат.
     * @return Результат обчислення, який зчитано з файлу.
     * @throws IOException Якщо виникає помилка під час зчитування з файлу.
     */
    public static double readText(String txtFile) throws IOException {
        double result = 0.0;
        try (BufferedReader reader = new BufferedReader(new FileReader(txtFile))) {
            String line = reader.readLine();
            if (line != null && line.startsWith("Результат:")) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    result = Double.parseDouble(parts[1].trim());
                }
            }
        }
        return result;
    }

    /**
     * Записує результат обчислень у бінарний файл.
     *
     * @param result  Результат обчислення для запису.
     * @param binFile Ім'я бінарного файлу, в який записуватиметься результат.
     * @throws IOException Якщо виникає помилка під час запису в файл.
     */
    public static void writeBinary(double result, String binFile) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(binFile))) {
            oos.writeDouble(result);
        }
    }

    /**
     * Зчитує результат обчислень з бінарного файлу.
     *
     * @param binFile Ім'я бінарного файлу, з якого зчитуватиметься результат.
     * @return Результат обчислення, який зчитано з файлу.
     * @throws IOException Якщо виникає помилка під час зчитування з файлу.
     */
    public static double readBinary(String binFile) throws IOException {
        double result = 0.0;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(binFile))) {
            result = ois.readDouble();
        }
        return result;
    }
}

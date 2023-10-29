import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Програма для генерації та виведення зубчастого масиву з заповнювачами на екран та в файл.
 * @author Valeriy Gritsay KI-304
 * @since 2.0
 */
public class Lab1GritsayKI304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру зубчастого масиву
        System.out.print("Введіть розмір зубчастого масиву: ");
        int arraySize = scanner.nextInt();

        if (arraySize <= 0) {
            System.out.println("Розмір масиву має бути більше за 0.");
            return;
        }

        // Введення символу-заповнювача
        System.out.print("Введіть символ-заповнювач масиву: ");
        char fillCharacter = scanner.next().charAt(0);

        ArrayList<char[]> jaggedArray = generateJaggedArray(arraySize, fillCharacter);

        // Виведення зубчастого масиву на екран
        System.out.println("Згенерований масив:");
        printJaggedArray(jaggedArray);

          // Запис зубчастого масиву у текстовий файл
        try {
        FileWriter writer = new FileWriter("array.txt");
        writeJaggedArrayToFile(jaggedArray, writer);
        writer.close();
        System.out.println("Масив збережено у файлі 'array.txt'.");
    } catch (IOException e) {
        System.out.println("Помилка при записі у файл.");
    }
}

    /**
     * Генерує зубчастий масив з заповнювачами.
     *
     * @param size           Розмір масиву.
     * @param fillCharacter Символ-заповнювач.
     * @return Зубчастий масив з заповнювачами.
     */
    private static ArrayList<char[]> generateJaggedArray(int size, char fillCharacter) {
        ArrayList<char[]> jaggedArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            char[] row = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                row[j] = fillCharacter;
            }
            jaggedArray.add(row);
        }
        return jaggedArray;
    }

    /**
     * Виводить зубчастий масив на екран.
     *
     * @param jaggedArray Зубчастий масив для виводу.
     */
    private static void printJaggedArray(ArrayList<char[]> jaggedArray) {
        for (char[] row : jaggedArray) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    /**
     * Записує зубчастий масив у текстовий файл.
     *
     * @param jaggedArray Зубчастий масив для запису.
     * @param writer      Об'єкт FileWriter для запису у файл.
     * @throws IOException Викидається в разі помилки при записі у файл.
     */
    private static void writeJaggedArrayToFile(ArrayList<char[]> jaggedArray, FileWriter writer) throws IOException {
        for (char[] row : jaggedArray) {
            for (char c : row) {
                writer.write(c);
            }
            writer.write("\n");
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab1GritsayKI304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру квадратної матриці
        System.out.print("Введіть розмір квадратної матриці: ");
        int matrixSize = scanner.nextInt();

        if (matrixSize <= 0) {
            System.out.println("Розмір матриці має бути більше за 0.");
            return;
        }

        // Введення символу-заповнювача
        System.out.print("Введіть символ-заповнювач масиву: ");
        char fillCharacter = scanner.next().charAt(0);

        char[][] matrix = generateMatrix(matrixSize, fillCharacter);

        // Виведення матриці на екран
        System.out.println("Згенерований масив:");
        printMatrix(matrix);

        // Запис матриці у текстовий файл
        try {
            FileWriter writer = new FileWriter("matrix.txt");
            writeMatrixToFile(matrix, writer);
            writer.close();
            System.out.println("Масив збережено у файлі 'matrix.txt'.");
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл.");
        }
    }

    private static char[][] generateMatrix(int size, char fillCharacter) {
        char[][] matrix = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= j && i >= size - 1 - j) {
                    matrix[i][j] = fillCharacter;
                } else {
                    matrix[i][j] = '0';
                }
            }
        }
        return matrix;
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void writeMatrixToFile(char[][] matrix, FileWriter writer) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                writer.write(matrix[i][j] + " ");
            }
            writer.write("\n");
        }
    }
}

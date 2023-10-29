package Lab2GritsayKI304;
import java.io.FileWriter;
import java.io.IOException;

public class Catinfo {
    // Метод для додавання коментаря до логу та запису у файл "log.txt"
    public static void log(String comment) {
        System.out.println(comment);
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(comment + "\n");
        } catch (IOException e) {
            System.err.println("Помилка при записі до файлу log.txt: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Створення об'єктів "Hair" та "Tail" для представлення волосся та хвоста кота
        Hair hair = new Hair("Чорний", "Пушистий");
        Tail tail = new Tail(20, "Пушистий");

        // Створення об'єкта "Cat" для представлення кота та ініціалізація його властивостей
        Cat myCat = new Cat("Барсик", 3, "Сіамська", hair, tail);

        // Виведення початкової інформації про кота та його властивості
        log("Початкова інформація про кота:");
        log(myCat.getFullInfo());
        log("Колір волосся: " + myCat.getHair().getColor());
        log("Текстура волосся: " + myCat.getHair().getTexture());
        log("Довжина хвоста: " + myCat.getTail().getLengthInCm() + " см");
        log("Текстура хвоста: " + myCat.getTail().getTexture());

        // Змінюємо інформацію про кота
        myCat.setName("Мурзик");
        myCat.getHair().setColor("Білий");
        myCat.getHair().setTexture("Гладенький");
        myCat.getTail().setLengthInCm(25);
        myCat.getTail().setTexture("Пушистий");

        // Виведення оновленої інформації про кота та його властивості
        log("\nОновлена інформація про кота:");
        log(myCat.getFullInfo());
        log("Колір волосся: " + myCat.getHair().getColor());
        log("Текстура волосся: " + myCat.getHair().getTexture());
        log("Довжина хвоста: " + myCat.getTail().getLengthInCm() + " см");
        log("Текстура хвоста: " + myCat.getTail().getTexture());
    }
}

package Lab6GritsayKI304;

public class ConveyorTest {
    public static void main(String[] args) {
        // Створюємо об'єкт конвеєра з типом елементів Double
        Conveyor<Double> conveyor = new Conveyor<>();

        // Додаємо декілька елементів до конвеєра
        conveyor.addElement(10.5);
        conveyor.addElement(5.2);
        conveyor.addElement(8.7);
        conveyor.addElement(3.0);

        // Виводимо початковий стан конвеєра
        System.out.println("Елементи конвеєру: " + conveyor);

        // Видаляємо певний елемент
        conveyor.removeElement(8.7);
        System.out.println("Елементи після видалення: " + conveyor);

        // Знаходимо та виводимо найменший елемент
        System.out.println("Найменший елемент: " + conveyor.findMinimum());

        // Сортуємо від найбільшого до найменшого
        conveyor.sortDescending();
        System.out.println("Сортування від найбільшого до найменшого: " + conveyor);

        // Сортуємо від найменшого до найбільшого
        conveyor.sortAscending();
        System.out.println("Сортування від найменшого до найбільшого: " + conveyor);

        // Обчислюємо та виводимо середнє арифметичне
        System.out.println("Середнє арифметичне: " + conveyor.calculateAverage());
    }
}

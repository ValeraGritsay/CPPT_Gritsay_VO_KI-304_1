package Lab6GritsayKI304;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Клас Conveyor представляє собою конвеєр для роботи з елементами, які реалізують інтерфейс Comparable.
 * @param <T> Тип елементів, які можна порівнювати між собою.
 */
public class Conveyor<T extends Comparable<T>> {
    private List<T> elements;

    /**
     * Конструктор без параметрів. Ініціалізує пустий список елементів.
     */
    public Conveyor() {
        this.elements = new ArrayList<>();
    }

    /**
     * Метод для додавання елемента до конвеєра.
     * @param element Елемент, який додається до конвеєра.
     */
    public void addElement(T element) {
        elements.add(element);
    }

    /**
     * Метод для видалення елемента з конвеєра.
     * @param element Елемент, який видаляється з конвеєра.
     */
    public void removeElement(T element) {
        elements.remove(element);
    }

    /**
     * Метод для знаходження мінімального елемента в конвеєрі.
     * @return Мінімальний елемент або null, якщо конвеєр пустий.
     */
    public T findMinimum() {
        if (elements.isEmpty()) {
            return null;
        }
        return Collections.min(elements);
    }

    /**
     * Метод для сортування елементів у порядку спадання.
     */
    public void sortDescending() {
        Collections.sort(elements, Collections.reverseOrder());
    }

    /**
     * Метод для сортування елементів у порядку зростання.
     */
    public void sortAscending() {
        Collections.sort(elements);
    }

    /**
     * Метод для обчислення середнього значення елементів в конвеєрі.
     * @return Середнє значення або 0.0, якщо конвеєр пустий.
     */
    public double calculateAverage() {
        if (elements.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (T element : elements) {
            sum += Double.parseDouble(element.toString());
        }
        return sum / elements.size();
    }

    /**
     * Перевизначений метод toString() для представлення конвеєра у вигляді рядка.
     * @return Рядок, який представляє елементи конвеєра.
     */
    @Override
    public String toString() {
        return elements.toString();
    }
}

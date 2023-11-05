package Lab3GritsayKI304;

import Lab2GritsayKI304.Hair;
import Lab2GritsayKI304.Tail;
/**
 * Абстрактний клас, що представляє кота
 */

public class Catt {
    private String name;
    private int age;
    private String breed;
    private Hair hair;
    private Tail tail;

    /**
     * Конструктор класу "Cat" для ініціалізації властивостей кота.
     *
     * @param name  Ім'я кота.
     * @param age   Вік кота.
     * @param breed Порода кота.
     * @param hair  Об'єкт класу "Hair" для волосся кота.
     * @param tail  Об'єкт класу "Tail" для хвоста кота.
     */
    public Catt(String name, int age, String breed, Hair hair, Tail tail) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.hair = hair;
        this.tail = tail;
    }

    /**
     * Метод для отримання імені кота.
     *
     * @return Ім'я кота.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для зміни імені кота.
     *
     * @param name Нове ім'я кота.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод для отримання віку кота.
     *
     * @return Вік кота.
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод для зміни віку кота.
     *
     * @param age Новий вік кота.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Метод для отримання породи кота.
     *
     * @return Порода кота.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Метод для зміни породи кота.
     *
     * @param breed Нова порода кота.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Метод для отримання об'єкта "Hair" (волосся кота).
     *
     * @return Об'єкт "Hair".
     */
    public Hair getHair() {
        return hair;
    }

    /**
     * Метод для отримання об'єкта "Tail" (хвост кота).
     *
     * @return Об'єкт "Tail".
     */
    public Tail getTail() {
        return tail;
    }

    /**
     * Метод для отримання повної інформації про кота.
     *
     * @return Рядок з інформацією про кота.
     */
    public String getFullInfo() {
        return "Ім'я: " + name + "\nВік: " + age + "\nПорода: " + breed;
    }

}

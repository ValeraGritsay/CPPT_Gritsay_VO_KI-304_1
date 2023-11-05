package Lab3GritsayKI304;

import Lab2GritsayKI304.Hair;
import Lab2GritsayKI304.Tail;

public class LabCatTest {
    public static void main(String[] args) {
        // Створюємо об'єкт класу "Hair" для волосся кота
        Hair hair = new Hair("Сірий", "Короткий");

        // Створюємо об'єкт класу "Tail" для хвоста кота
        Tail tail = new Tail(15, "Пушистий");

        // Створюємо об'єкт піддослідного кота
        LabCat labCat = new LabCat("Барсік", 3, "Персидська", hair, tail, "Біологічні дослідження");

        // Виводимо інформацію про піддослідного кота
        System.out.println("Інформація про піддослідного кота:");
        System.out.println(labCat.getFullInfo());


        // Змінюємо область досліджень піддослідного кота
        labCat.setResearchArea("Хімічні дослідження");

        // Виводимо оновлену інформацію про піддослідного кота
        System.out.println("Оновлена інформація про піддослідного кота:");
        System.out.println(labCat.getFullInfo());

    }
}

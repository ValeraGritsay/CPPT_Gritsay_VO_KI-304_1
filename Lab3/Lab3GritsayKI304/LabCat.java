package Lab3GritsayKI304;

import Lab2GritsayKI304.Hair;
import Lab2GritsayKI304.Tail;

/**
 * Підклас, який представляє піддослідного кота.
 */
public class LabCat extends Catt implements Researchable {
    private String researchArea;

    /**
     * Конструктор класу "LabCat" для ініціалізації властивостей піддослідного кота.
     *
     * @param name          Ім'я кота.
     * @param age           Вік кота.
     * @param breed         Порода кота.
     * @param hair          Об'єкт класу "Hair" для волосся кота.
     * @param tail          Об'єкт класу "Tail" для хвоста кота.
     * @param researchArea  Область досліджень піддослідного кота.
     */
    public LabCat(String name, int age, String breed, Hair hair, Tail tail, String researchArea) {
        super(name, age, breed, hair, tail);
        this.researchArea = researchArea;
    }

    /**
     * Метод для отримання області досліджень піддослідного кота.
     *
     * @return Область досліджень.
     */
    public String getResearchArea() {
        return researchArea;
    }

    /**
     * Метод для зміни області досліджень піддослідного кота.
     *
     * @param researchArea Нова область досліджень.
     */
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    /**
     * Метод для отримання повної інформації про піддослідного кота, включаючи область досліджень.
     *
     * @return Рядок з інформацією про піддослідного кота.
     */
    @Override
    public String getFullInfo() {
        return super.getFullInfo() + "\nОбласть досліджень: " + researchArea;
    }
}

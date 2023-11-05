package Lab3GritsayKI304;

/**
 * Інтерфейс для представлення піддослідних об'єктів.
 */
public interface Researchable {
    /**
     * Метод для отримання області досліджень об'єкта.
     *
     * @return Область досліджень.
     */
    String getResearchArea();

    /**
     * Метод для зміни області досліджень об'єкта.
     *
     * @param researchArea Нова область досліджень.
     */
    void setResearchArea(String researchArea);
}

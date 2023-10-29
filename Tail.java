package Lab2GritsayKI304;

public class Tail {
    private int lengthInCm;
    private String texture;

    /**
     * Конструктор класу "Tail" для ініціалізації властивостей хвоста.
     *
     * @param lengthInCm Довжина хвоста в сантиметрах.
     * @param texture    Текстура хвоста.
     */
    public Tail(int lengthInCm, String texture) {
        this.lengthInCm = lengthInCm;
        this.texture = texture;
    }

    /**
     * Метод для отримання довжини хвоста в сантиметрах.
     *
     * @return Довжина хвоста.
     */
    public int getLengthInCm() {
        return lengthInCm;
    }

    /**
     * Метод для зміни довжини хвоста.
     *
     * @param lengthInCm Нова довжина хвоста в сантиметрах.
     */
    public void setLengthInCm(int lengthInCm) {
        this.lengthInCm = lengthInCm;
    }

    /**
     * Метод для отримання текстури хвоста.
     *
     * @return Текстура хвоста.
     */
    public String getTexture() {
        return texture;
    }

    /**
     * Метод для зміни текстури хвоста.
     *
     * @param texture Нова текстура хвоста.
     */
    public void setTexture(String texture) {
        this.texture = texture;
    }
}

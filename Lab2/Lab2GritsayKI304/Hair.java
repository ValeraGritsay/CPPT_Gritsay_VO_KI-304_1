package Lab2GritsayKI304;

public class Hair {
    private String color;
    private String texture;

    /**
     * Конструктор класу "Hair" для ініціалізації властивостей волосся.
     *
     * @param color   Колір волосся.
     * @param texture Текстура волосся.
     */
    public Hair(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    /**
     * Метод для отримання кольору волосся.
     *
     * @return Колір волосся.
     */
    public String getColor() {
        return color;
    }

    /**
     * Метод для зміни кольору волосся.
     *
     * @param color Новий колір волосся.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Метод для отримання текстури волосся.
     *
     * @return Текстура волосся.
     */
    public String getTexture() {
        return texture;
    }

    /**
     * Метод для зміни текстури волосся.
     *
     * @param texture Нова текстура волосся.
     */
    public void setTexture(String texture) {
        this.texture = texture;
    }
}

package task_6;

/**
 * Класс, отвечающий за представление записи. Содержит поле с текстом.
 */
public class Note {
    public Note() {}
    public Note(String t) {
        text = t;
    }

    private String text;

    /**
     * Метод задает значение переметра
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Метод дакет возможность получить значение
     * @return text
     */
    public String getText() {
        return text;
    }
}

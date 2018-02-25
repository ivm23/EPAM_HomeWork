package music;

/**
 * класс для описания музыки
 */
public class Music {
    /**
     * значение музыки по умолчанию
     */
    private String music = "lalalala";

    /**
     *
     * @return значение музыки
     */
    public String getMusic() {
        return music;
    }

    /**
     * Установить новую музыку
     * @param music значение музыки
     */
    public void setMusic(String music) {
        this.music = music;
    }

    /**
     *
     * @param music музыка по умолчению (может быть пустой конструктор)
     */
    public Music(String music) {
        this.music = music;
    }
    public Music() {};
}

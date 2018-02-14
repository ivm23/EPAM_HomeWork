package musicalInstruments;

import music.Music;

/**
 * класс для описания Горна
 * Наследование
 */
public class Horn extends WindInstrument {
    /**
     * музыка инструмента по умолчанию
     * Инкапсуляция
     */
    private Music music = new Music("H-o-r-n");

    /**
     * Полиморфизм
     * @param setting настройки инструмента
     * @param music музыка, которую инструмсент будет играть
     */
    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(this.music.getMusic() + music.getMusic());
        System.out.println("Setting Horn: " + setting);
        super.setSetting(setting);
    }
    /**
     * Полиморфизм
     * метод для воспроизведения музыки
     */
    @Override
    public void play() {
        System.out.println("Horn play: " + music.getMusic());
        music.setMusic("H-o-r-n");
    }
    /**
     * Наследование
     * @param brand бренд Горна
     */
    public Horn(String brand) {
        super(brand);
    }
}

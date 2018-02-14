package musicalInstruments;

import music.Music;

/**
 * класс для описания саксофона
 * Наследование
 */
public class Saxophone extends WindInstrument{
    /**
     * музыка инструмента по умолчанию
     * Инкапсуляция
     */
    private Music music = new Music("s-a-x-o-p-h-o-n-e!");

    /**
     * Полиморфизм
     * @param setting настройки инструмента
     * @param music музыка, которую инструмсент будет играть
     */
    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Saxophone setting: " + setting);
        super.setSetting(setting);
    }

    /**
     * Полиморфизм
     * метод для воспроизведения музыки
     */
    @Override
    public void play() {
        System.out.println("Saxophone play: " + music.getMusic());
    }

    /**
     * Наследование
     * @param brand бренд саксофона
     */
    public Saxophone(String brand) {
        super(brand);
    }

}


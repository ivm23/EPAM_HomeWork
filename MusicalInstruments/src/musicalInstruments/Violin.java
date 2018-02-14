package musicalInstruments;

import music.Music;

/**
 * класс для описания виолончели
 * Наследование
 */
public class Violin extends StringeInstrument{
    /**
     * музыка инструмента по умолчанию
     * Инкапсуляция
     */
    private Music music = new Music("V-i-o-l-i-n");


    /**
     * Полиморфизм
     * @param setting настройки инструмента
     * @param music музыка, которую инструмсент будет играть
     */
    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Violin setting: " + setting);
        super.setSetting(setting);
    }
    /**
     * Полиморфизм
     * метод для воспроизведения музыки
     */
    @Override
    public void play() {
        System.out.println("Violin play: " + music.getMusic());
    }

    /**
     * Наследование
     * @param brand бренд виолончели
     */
    public Violin(String brand) {
        super(brand);
    }
}

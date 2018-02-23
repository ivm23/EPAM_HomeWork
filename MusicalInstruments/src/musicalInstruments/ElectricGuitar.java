package musicalInstruments;

import music.Music;

/**
 * класс для описания электрической гитары
 * Наследование
 */
public class ElectricGuitar extends Guitar {
    /**
     * музыка инструмента по умолчанию
     * Инкапсуляция
     */
    private Music music;

    /**
     * коструктор: установка количества струн и бренда
     * Наследование
     *
     * @param brand бренд электронной гитары
     */
    public ElectricGuitar(String brand) {
        super(brand);
        super.setCountOfString(5);
        music = new Music("E-l-e-c-t-r-i-c G-u-i-t-a-r!");
    }

    /**
     * Полиморфизм
     *
     * @param setting настройки инструмента
     * @param music   музыка, которую инструмсент будет играть
     */
    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Electric Guitar setting: " + setting);
        super.setSetting(setting);
    }

    /**
     * метод для игры баса
     */
    public void playBass() {
        System.out.println(" BAAAAAAAASS");
    }

    /**
     * Полиморфизм
     * метод для воспроизведения музыки
     */
    @Override
    public void play() {
        System.out.print("Electric Guitar play: " + music.getMusic());
        playBass();
    }


}

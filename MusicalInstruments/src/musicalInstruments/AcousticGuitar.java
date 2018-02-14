package musicalInstruments;

import music.Music;

/**
 * класс для описания аккустической гитары
 * Наследование
 */
public class AcousticGuitar extends Guitar{
    /**
     * музыка инструмента по умолчанию
     * Инкапсуляция
     */
    private Music music = new Music("A-c-o-u-s-t-i-c G-u-i-t-a-r!");

    /**
     * Полиморфизм
     * @param setting настройки инструмента
     * @param music музыка, которую инструмсент будет играть
     */
    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Acoustic Guitar setting: " + setting);
        super.setSetting(setting);
    }

    /**
     * Полиморфизм
     * метод для воспроизведения музыки
     */
    @Override
    public void play() {
        System.out.println("Acoustic Guitar play: " + music.getMusic());
    }
    /**
     * коструктор: установка количества струн и бренда
     * Наследование
     * @param brand бренд электронной гитары
     *
     */
    public AcousticGuitar(String brand) {
        super(brand);
        super.setCountOfString(8);
    }
}

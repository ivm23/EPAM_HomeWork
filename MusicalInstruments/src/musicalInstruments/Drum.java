package musicalInstruments;

import music.Music;

/**
 * класс для описания барабана
 * Наследование
 */
public class Drum extends PercussionInstrument {
    /**
     * музыка инструмента по умолчанию
     * Инкапсуляция
     */
    private Music music = new Music("D-r-u-m");

    /**
     * Полиморфизм
     * @param setting настройки инструмента
     * @param music музыка, которую инструмсент будет играть
     */
    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Drum setting: " + setting);
    }

    /**
     * Полиморфизм
     * метод для воспроизведения музыки
     */
    @Override
    public void play(){
        System.out.println("Drum play: " + music.getMusic() + " with rhythm: " + super.getRhythm());
    }

}

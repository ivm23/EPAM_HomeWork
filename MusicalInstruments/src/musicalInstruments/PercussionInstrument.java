package musicalInstruments;

import music.Music;

/**
 * класс для представления ударных инструментов
 */
abstract class
PercussionInstrument implements MusicalInstrument {
    /**
     * поле для описания ритма инструмента
     * Инкапсуляция
     */
    private int rhythm;

    abstract public void tune(String setting, Music music);
    abstract public void play();

    /**
     * Полиморфизм
     * @param setting настройки инструмента
     * @param music музыка, которую инструмсент будет играть
     */
    public void playMusic(String setting, Music music) {
        tune(setting, music);
        makeRhythm(this.rhythm);
        play();
    }

    /**
     *
     * @return установленный ритм для данного инструмента
     */
    public int getRhythm() {
        return this.rhythm;
    }

    /**
     *
     * @param rhythm ритм, который хотим установить для данного инструмента
     */
    public void makeRhythm(int rhythm) {
        this.rhythm = rhythm;
        System.out.print("Percussion Instrument rhythm: ");
        System.out.println(rhythm);
    }
}

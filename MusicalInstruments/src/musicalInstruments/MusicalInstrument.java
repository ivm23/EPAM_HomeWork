package musicalInstruments;

import music.Music;

/**
 * интерфейс для описания музыкальных инструментов
 */
public interface MusicalInstrument {

    void play();
    void tune(String setting, Music music);

    default void playMusic(String setting, Music music) {
        tune(setting, music);
        play();
    }
}

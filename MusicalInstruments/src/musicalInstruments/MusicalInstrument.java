package musicalInstruments;

import music.Music;

public interface MusicalInstrument {
    void play();
    void tune(String setting, Music music);

    default void playMusic(String setting, Music music) {
        tune(setting, music);
        play();
    }
}

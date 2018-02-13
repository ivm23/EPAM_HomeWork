package musicalInstruments;

import music.Music;

abstract class PercussionInstrument implements MusicalInstrument {

    private int rhythm;

    abstract public void tune(String setting, Music music);
    abstract public void play();

    public void playMusic(String setting, Music music) {
        tune(setting, music);
        makeRhythm(this.rhythm);
        play();
    }
    public int getRhythm() {
        return this.rhythm;
    }

    public void makeRhythm(int rhythm) {
        this.rhythm = rhythm;
        System.out.print("Percussion Instrument rhythm: ");
        System.out.println(rhythm);
    }
}

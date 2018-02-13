package musicalInstruments;

import music.Music;

abstract class Guitar extends StringeInstrument {

    private int countOfString;

    abstract public void tune(String setting, Music music);
    abstract public void play();

    public int getCountOfString() {
        return countOfString;
    }
    public void setCountOfString(int countOfString) {
        this.countOfString = countOfString;
    }

    public Guitar(String brand) {
        super(brand);
    }
}

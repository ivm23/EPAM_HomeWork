package musicalInstruments;

import music.Music;

abstract class WindInstrument implements MusicalInstrument {
    abstract public void tune(String setting, Music music);
    abstract public void play();

    public String getBrand() {
        return brand;
    }
    public String getSetting() {
        return setting;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSetting(String setting) {
        this.setting = setting;
    }

    private String brand;
    private String setting;

    public WindInstrument(String brand) {
        this.brand = brand;
    }
}
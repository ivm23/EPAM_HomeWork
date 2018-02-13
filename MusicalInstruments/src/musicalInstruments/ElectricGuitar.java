package musicalInstruments;

import music.Music;

public class ElectricGuitar extends Guitar {
    private Music music = new Music("E-l-e-c-t-r-i-c G-u-i-t-a-r!");

    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Electric Guitar setting: " + setting);
        super.setSetting(setting);
    }

    public void playBass() {
        System.out.println(" BAAAAAAAASS");
    }

    @Override
    public void play() {
        System.out.print("Electric Guitar play: " + music.getMusic());
        playBass();
    }

    public ElectricGuitar(String brand) {
        super(brand);
        super.setCountOfString(5);
    }
}

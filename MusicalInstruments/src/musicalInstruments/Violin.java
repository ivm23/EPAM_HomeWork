package musicalInstruments;

import music.Music;

public class Violin extends StringeInstrument{
    private Music music = new Music("V-i-o-l-i-n");

    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Violin setting: " + setting);
        super.setSetting(setting);
    }

    @Override
    public void play() {
        System.out.println("Violin play: " + music.getMusic());
    }

    public Violin(String brand) {
        super(brand);
    }
}

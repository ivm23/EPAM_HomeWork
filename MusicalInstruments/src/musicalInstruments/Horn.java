package musicalInstruments;

import music.Music;

public class Horn extends WindInstrument {
    private Music music = new Music("H-o-r-n");

    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(this.music.getMusic() + music.getMusic());
        System.out.println("Setting Horn: " + setting);
        super.setSetting(setting);
    }

    @Override
    public void play() {
        System.out.println("Horn play: " + music.getMusic());
        music.setMusic("H-o-r-n");
    }

    public Horn(String brand) {
        super(brand);
    }
}

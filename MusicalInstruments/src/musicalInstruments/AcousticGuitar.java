package musicalInstruments;

import music.Music;

public class AcousticGuitar extends Guitar{
    private Music music = new Music("A-c-o-u-s-t-i-c G-u-i-t-a-r!");

    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Acoustic Guitar setting: " + setting);
        super.setSetting(setting);
    }

    @Override
    public void play() {
        System.out.println("Acoustic Guitar play: " + music.getMusic());
    }

    public AcousticGuitar(String brand) {
        super(brand);
        super.setCountOfString(8);
    }
}

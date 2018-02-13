package musicalInstruments;

import music.Music;


public class Saxophone extends WindInstrument{

    private Music music = new Music("s-a-x-o-p-h-o-n-e!");

    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Saxophone setting: " + setting);
        super.setSetting(setting);
    }

    @Override
    public void play() {
        System.out.println("Saxophone play: " + music.getMusic());
    }

    public Saxophone(String brand) {
        super(brand);
    }

}


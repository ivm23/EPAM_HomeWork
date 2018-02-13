package musicalInstruments;

import music.Music;

public class Drum extends PercussionInstrument {
    private Music music = new Music("D-r-u-m");

    @Override
    public void tune(String setting, Music music) {
        this.music.setMusic(music.getMusic());
        System.out.println("Drum setting: " + setting);
    }

    @Override
    public void play(){
        System.out.println("Drum play: " + music.getMusic() + " with rhythm: " + super.getRhythm());
    }

}

package application;


import music.Music;
import musicalInstruments.AcousticGuitar;
import musicalInstruments.ElectricGuitar;
import musicalInstruments.Horn;
import musicalInstruments.Violin;

import java.util.ArrayList;

public class AppWorkWithDifferentTypes {
    public static void main(String[] args) {
        Music music = new Music("HAPPY");
        ArrayList<Object> musicalInstruments = new ArrayList<>();

        Object electricGuitar = new ElectricGuitar("EG");
        Object acousticGuitar = new AcousticGuitar("AG");
        Object violin = new Violin("V");
        Object horn = new Horn("V");

        musicalInstruments.add(electricGuitar);
        musicalInstruments.add(acousticGuitar);
        musicalInstruments.add(violin);
        musicalInstruments.add(horn);

        for (Object musicalInstrument : musicalInstruments) {
            if (musicalInstrument instanceof ElectricGuitar) {
                ((ElectricGuitar) musicalInstrument).playBass();
            } else if (musicalInstrument instanceof AcousticGuitar) {
                ((AcousticGuitar) musicalInstrument).playMusic("Setting", music);
            } else if (musicalInstrument instanceof Violin) {
                ((Violin) musicalInstrument).playMusic("Setting", music);
            }
                  /*
                     Если сделаем так, то получим ошибку при компиляции:
                     else {
                musicalInstrument = (ElectricGuitar)musicalInstrument;
                ((ElectricGuitar) musicalInstrument).playBass();
                    }
                    */
        }

    }
}

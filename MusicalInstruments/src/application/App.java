package application;

import musicalInstruments.Saxophone;
import music.Music;
import musicalInstruments.Horn;
import musicalInstruments.Drum;
import musicalInstruments.Violin;
import musicalInstruments.ElectricGuitar;
import musicalInstruments.AcousticGuitar;

import java.nio.channels.AcceptPendingException;

public class App {
    public static void main(String[] args) {
        System.out.println("Musical Instruments!");

        Saxophone sax = new Saxophone("SaxophoneBrand");
        sax.play();
        Music musicSax = new Music("SSSS");
        sax.playMusic("settingSax", musicSax);
        sax.play();
        System.out.print("Brand: ");
        System.out.println(sax.getBrand());
        System.out.println();


        Horn horn = new Horn("HornBrand");
        horn.play();
        Music musicHorn = new Music("HHHH");
        horn.playMusic("settingHorn", musicHorn);
        System.out.print("Saxophone Setting: ");
        System.out.println(sax.getSetting());

        horn.play();
        System.out.print("Brand: ");
        System.out.println(horn.getBrand());
        System.out.println();

        Drum drum = new Drum();
        drum.play();
        Music musicDrum = new Music("DDDD");
        drum.playMusic("settingDrum", musicDrum);
        drum.play();
        drum.makeRhythm(100);
        drum.playMusic("settingDrum", musicDrum);
        System.out.println();

        Violin violin = new Violin("ViolinBrand");
        violin.play();
        Music musicViolin = new Music("VVVV");
        violin.playMusic("settingViolin", musicViolin);
        violin.play();
        System.out.print("Brand: ");
        System.out.println(violin.getBrand());
        System.out.println();


        ElectricGuitar eGuitar = new ElectricGuitar("ElectricGuitarBrand");
        eGuitar.play();
        Music musicEGuitar = new Music("EEEE");
        eGuitar.playMusic("settingEGuitar", musicEGuitar);
        eGuitar.play();
        System.out.print("Brand: ");
        System.out.println(eGuitar.getBrand());
        System.out.print("Count of strings of electric guitar: ");
        System.out.println(eGuitar.getCountOfString());
        System.out.println();

        AcousticGuitar aGuitar = new AcousticGuitar("AcousticGuitarBrand");
        aGuitar.play();
        Music musicAGuitar = new Music();
        aGuitar.playMusic("settingAGuitar", musicAGuitar);
        aGuitar.play();
        System.out.print("Brand: ");
        System.out.println(aGuitar.getBrand());
        System.out.print("Count of strings of acoustic guitar: ");
        System.out.println(aGuitar.getCountOfString());
        System.out.println();


    }
}

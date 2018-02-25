package musicalInstruments;

import music.Music;

/**
 * класс для описания гитары
 * Наследование
 */
abstract class Guitar extends StringeInstrument {
    /**
     * количество струн гитары
     * Инкапсуляция
     */
    private int countOfString;

    /**
     * Наследование
     *
     * @param brand бренд гитары
     */
    public Guitar(String brand) {
        super(brand);
    }

    abstract public void tune(String setting, Music music);

    abstract public void play();

    /**
     * @return количество струн гитары
     */
    public int getCountOfString() {
        return countOfString;
    }

    /**
     * Установить количество струн гитары
     *
     * @param countOfString количество струн гитары
     */
    public void setCountOfString(int countOfString) {
        this.countOfString = countOfString;
    }

}

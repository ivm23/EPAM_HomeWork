package musicalInstruments;

import music.Music;

/**
 * класс для представления струнных инструментов
 */
abstract class StringeInstrument implements MusicalInstrument {
    abstract public void tune(String setting, Music music);
        abstract public void play();

    /**
     * Инкапсуляция
     * @return бренд инструмента
     */
        public String getBrand() {
            return brand;
        }
    /**
     * Инкапсуляция
     * @return настройки инструмента
     */
        public String getSetting() {
            return setting;
        }
    /**
     * Установить бренд для инструмента
     * Инкапсуляция
     * @param brand бренд инструмента
     */
        public void setBrand(String brand) {
            this.brand = brand;
        }

    /**
     * Установить настройки для инструмента
     * Инкапсуляция
     * @param setting настройки инструмента
     */
        public void setSetting(String setting) {
            this.setting = setting;
        }
    /**
     * поле для описания бренда инструмента
     * Инкапсуляция
     */
        private String brand;
    /**
     * поле для описания настроек инструмента
     * Инкапсуляция
     */
        private String setting;
    /**
     * Наследование
     * @param brand бренд струнного инструмента
     */
        public StringeInstrument(String brand) {
            this.brand = brand;
        }
}

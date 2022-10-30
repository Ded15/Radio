package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void switchingRadioStations() { // переключение ралдиостанций
        Radio cond = new Radio();

        cond.setRadioStationNumber(7);

        int expected = 8;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maximumWave() { // максимально допустимое
        Radio cond = new Radio();

        cond.setRadioStationNumber(10);

        int expected = 0;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minimumWave() { // минимально допустимое
        Radio cond = new Radio();

        cond.setRadioStationNumber(-1);

        int expected = 9;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheSound() { //увеличение звука в пределах
        Radio cond = new Radio();

        cond.setVolume(6);

        int expected = 7;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minimalSound() { //уменьшение звука до минимума
        Radio cond = new Radio();

        cond.setVolume(0);

        int expected = 0;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void maximumSound() { //увеличение звука до максимума
        Radio cond = new Radio();

        cond.setVolume(10);

        int expected = 10;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }

}

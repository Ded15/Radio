package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void switchingRadioStations() { // переключение ралдиостанций
        Radio cond = new Radio(10);

        cond.setRadioStationNumber(7);

        int expected = 8;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxiWave() { // максимально допустимое
        Radio cond = new Radio(10);

        cond.setRadioStationNumber(9);

        int expected = 0;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minWave() { // минимальное допустимое
        Radio cond = new Radio(10);

        cond.setRadioStationNumber(-1);

        int expected = 9;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLevel() {
        Radio cond = new Radio(0, 100);

        cond.setVolume(15);

        int expected = 16;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minVolumeLevel() {
        Radio cond = new Radio(0, 100);

        cond.setVolume(-1);

        int expected = 0;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxVolumeLevel() {
        Radio cond = new Radio(0, 100);

        cond.setVolume(101);

        int expected = 100;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }

}

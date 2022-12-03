package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void switchingRadioStations() { 
        Radio cond = new Radio();
        cond.setRadioStationNumber(7);

        cond.next();

        int expected = 8;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maximumWave() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(9);
        cond.next();

        int expected = 0;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimumWave() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(0);
        cond.prev();

        int expected = 9;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void min() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(-1);
        cond.prev();

        int expected = 9;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheSound() {
        Radio cond = new Radio();
        cond.setCurrentAudioVolume(6);
        cond.increaseTheVolume();

        int expected = 7;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void switchingRadio() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(6);
        cond.prev();

        int expected = 5;
        int actual = cond.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maximumSound() {
        Radio cond = new Radio();
        cond.setCurrentAudioVolume(10);
        cond.increaseTheVolume();

        int expected = 10;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minimalSound() {
        Radio cond = new Radio();
        cond.setCurrentAudioVolume(0);
        cond.volumeReduction();

        int expected = 0;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void minSound() {
        Radio cond = new Radio();
        cond.setCurrentAudioVolume(-1);
        cond.volumeReduction();

        int expected = 0;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void Sound() {
        Radio cond = new Radio();
        cond.setCurrentAudioVolume(3);
        cond.volumeReduction();

        int expected = 2;
        int actual = cond.getVolume();

        Assertions.assertEquals(expected, actual);

    }


}

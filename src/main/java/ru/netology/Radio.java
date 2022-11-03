package ru.netology;

public class Radio {
    public int radioStationNumber; //переключение волны на радио
    public int currentAudioVolume; //объём звука

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getVolume() {
        return currentAudioVolume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            newRadioStationNumber = 9 - 1;
        }
        if (newRadioStationNumber < 9) {
            newRadioStationNumber = newRadioStationNumber + 1;
        } else {
            newRadioStationNumber = 0;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume <= 0) {
            return;
        }
        if (newVolume < 10) {
            newVolume = newVolume + 1;
        } else {
            newVolume = 10;
        }

        currentAudioVolume = newVolume;
    }
}

package ru.netology;

public class Radio {
    public int currenRadioStationNumber;
    public int currentAudioVolume;

    private int maxRadioStationNumder;
    private int minRadioStationNumder = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getRadioStationNumber() {

        return currenRadioStationNumber;
    }

    public int getVolume() {

        return currentAudioVolume;
    }

    public Radio(int max) {
        maxRadioStationNumder = max - 1;

    }

    public Radio(int minVolume, int maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumder) {
            newRadioStationNumber = maxRadioStationNumder - 1;
        }
        if (newRadioStationNumber < maxRadioStationNumder) {
            newRadioStationNumber = newRadioStationNumber + 1;
        } else {
            newRadioStationNumber = minRadioStationNumder;
        }

        currenRadioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume <= minVolume) {
            return;
        }
        if (newVolume < maxVolume) {
            newVolume = newVolume + 1;
        } else {
            newVolume = maxVolume;
        }

        currentAudioVolume = newVolume;
    }
}

package ru.netology;

public class Radio {
    private int radioStationNumber; //переключение волны на радио
    private int currentAudioVolume; //объём звука

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > 9) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }


    public int getVolume() {

        return currentAudioVolume;
    }

    public void setCurrentAudioVolume(int currentAudioVolume) {
        if (currentAudioVolume < 0) {
            return;
        }
        if (currentAudioVolume > 10) {
            return;
        }
        this.currentAudioVolume = currentAudioVolume;
    }

    public void prev() {
        if (radioStationNumber > 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = 9;

        }
    }

    public void next() {
        if (radioStationNumber < 9) {
            radioStationNumber++;
        } else {
            radioStationNumber = 0;
        }

    }

    public void increaseTheVolume() {
        if (currentAudioVolume < 10) {
            currentAudioVolume++;
        } else {
            currentAudioVolume = 10;
        }
    }

    public void volumeReduction() {
        if (currentAudioVolume > 0) {
            currentAudioVolume--;
        } else {
            currentAudioVolume = 0;
        }
    }
}




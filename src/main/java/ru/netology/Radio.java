package ru.netology;

public class Radio {
    public int currentStationNumber;
    public int currentVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }


    public void setCurrentStationNumber(int newCurrentStationNumber) {
        currentStationNumber = newCurrentStationNumber;
    }

    public void nextStationNumber() {
        if (currentStationNumber < 9) {
            currentStationNumber = currentStationNumber + 1;
        }
        if (currentStationNumber > 9) {
            currentStationNumber = 0;
        }
    }

    public void prevStationNumberIfNull() {

        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        }
    }

    public void prevStationNumber() {
        if (currentStationNumber <= 9) {
            currentStationNumber = currentStationNumber - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume < 101) {
            currentVolume = currentVolume - 1;
        }

    }

    public void shouldNotIncreaseVolumeAboveMax() {
        if (currentVolume > 100) {
            currentVolume = 100;
        }
    }

    public void shouldNotDecreaseVolumeBelowMin() {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }


}

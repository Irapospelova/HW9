package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(3);
        radio.nextStationNumber();
        int expected = 4;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationNumberAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        radio.nextStationNumber();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.prevStationNumber();
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetPrevStationNumberInTheMid() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.prevStationNumber();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetPrevStationNumberIfNull() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prevStationNumberIfNull();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStationIfBelowNull() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        radio.prevStationNumberIfNull();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.increaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.shouldNotIncreaseVolumeAboveMax();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.shouldNotDecreaseVolumeBelowMin();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}

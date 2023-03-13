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
    public void shouldSetPrevStationNumberIfInTheMid() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.prevStationNumber();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetPrevStationNumberIfEqualsNull() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prevStationNumberIfNull();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStationIfAboveNull() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.prevStationNumberIfNull();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
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
    public void shouldDecreaseVolumeFromMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
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
    public void shouldNotIncreaseVolumeIfEqualsMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
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

    @Test
    public void shouldNotDecreaseVolumeIfEqualsMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.shouldNotDecreaseVolumeBelowMin();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}

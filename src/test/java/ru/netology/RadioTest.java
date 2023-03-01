package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        int expected = 5;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 2;
        int expected = 2;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxChannelNum() {
        Radio radio = new Radio();
        radio.maxChannelNum();
        int expected = 9;
        int actual = radio.maxChannelNum;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minChannelNum() {
        Radio radio = new Radio();
        radio.minChannelNum();
        int expected = 0;
        int actual = radio.minChannelNum;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentChannelNum() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum();
        int expected = 0;
        int actual = radio.currentChannelNum;
        Assertions.assertEquals(expected, actual);

    }
}









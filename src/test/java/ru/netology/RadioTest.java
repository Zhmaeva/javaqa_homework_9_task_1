package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    // тест на установку текущей радиостанции ниже допустимого значения 0-9
    @Test
    public void shouldSetCurrentStationBelowMin() {
        Radio radioStation = new Radio();

        radioStation.setCurrentStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку текущей радиостанции выше допустимого значения 0-9
    @Test
    public void shouldSetCurrentStationAboveMax() {
        Radio radioStation = new Radio();

        radioStation.setCurrentStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку значения радиостанции в пределах допустимых значений 0-9
    @Test
    public void shouldSetCurrentStationWithinValidValue() {
        Radio radioStation = new Radio();

        radioStation.setCurrentStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение следующей станции выше допустимого значения 0-9
    @Test
    public void shouldSetNextStationAboveMax() {
        Radio radio = new Radio();

        radio.nextStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение следующей станции на максимальное допустимое значение
    @Test
    public void shouldSetNextStationToMax() {
        Radio radio = new Radio();

        radio.nextStation(9);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение станции на следующую, если значение в пределах допустимых от 0 до 9
    @Test
    public void shouldSetNextStationWithinValidValue() {
        Radio radio = new Radio();

        radio.nextStation(0);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение станции на предыдущую, если значение текущей станции минимальное
    @Test
    public void shouldSetPrevStationBelowMin() {
        Radio radio = new Radio();

        radio.prevStation(0);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение станции на предыдущую, если значение в пределах допустимых значений 0-9
    @Test
    public void shouldSetPrevStationWithinValidValue() {
        Radio radio = new Radio();

        radio.prevStation(9);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку звука меньше допустимого 0-100
    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку звука больше допустимого 0-100
    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку звука в пределах допустимых значений 0-100
    @Test
    public void shouldSetVolumeWithinValidValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на увеличение громкости звука в пределах допустимых значений 0-100
    @Test
    public void shouldIncreaseVolumeWithinValidValue() {
        Radio radio = new Radio();

        radio.increaseVolume(0);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на увеличение громкости звука выше допустимого максимального значения 0-100
    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.increaseVolume(100);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на уменьшение громкости звука в пределах допустимых значений 0-100
    @Test
    public void shouldDecreaseVolumeWithinValidValue() {
        Radio radio = new Radio();

        radio.decreaseVolume(100);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на уменьшение громкости звука ниже допустимых значений
    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio radio = new Radio();

        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    Radio radio = new Radio();

    // тест конструктора с параметром (количество радиостанций)
    @Test
    public void shouldSetStationsCount() {
        Radio radioStation = new Radio(10);

        radioStation.setCurrentStation(9);
        radioStation.prevStation();
        radioStation.nextStation();

        Assertions.assertEquals(9, radioStation.getCurrentStation());
    }

    // тест на установку текущей радиостанции ниже допустимого значения 0-9
    @Test
    public void shouldSetCurrentStationBelowMin() {
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку текущей радиостанции выше допустимого значения 0-9
    @Test
    public void shouldSetCurrentStationAboveMax() {
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку значения радиостанции в пределах допустимых значений 0-9
    @Test
    public void shouldSetCurrentStationWithinValidValue() {
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение следующей станции выше допустимого значения 0-9
    @Test
    public void shouldSetNextStationAboveMax() {
        radio.setCurrentStation(11);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение следующей станции на максимальное допустимое значение
    @Test
    public void shouldSetNextStationToMax() {
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение станции на следующую, если значение в пределах допустимых от 0 до 9
    @Test
    public void shouldSetNextStationWithinValidValue() {
        radio.setCurrentStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение станции на предыдущую, если значение текущей станции минимальное
    @Test
    public void shouldSetPrevStationBelowMin() {
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на переключение станции на предыдущую, если значение в пределах допустимых значений 0-9
    @Test
    public void shouldSetPrevStationWithinValidValue() {
        radio.setCurrentStation(10);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку звука меньше допустимого 0-100
    @Test
    public void shouldSetVolumeBelowMin() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку звука больше допустимого 0-100
    @Test
    public void shouldSetVolumeAboveMax() {
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на установку звука в пределах допустимых значений 0-100
    @Test
    public void shouldSetVolumeWithinValidValue() {
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на увеличение громкости звука в пределах допустимых значений 0-100
    @Test
    public void shouldIncreaseVolumeWithinValidValue() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на увеличение громкости звука выше допустимого максимального значения 0-100
    @Test
    public void shouldIncreaseVolumeAboveMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на уменьшение громкости звука в пределах допустимых значений 0-100
    @Test
    public void shouldDecreaseVolumeWithinValidValue() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тест на уменьшение громкости звука ниже допустимых значений
    @Test
    public void shouldDecreaseVolumeBelowMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

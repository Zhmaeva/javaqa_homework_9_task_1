package ru.netology;

public class Radio {
    private int minStation = 0;
    private int maxStationValue = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int stationsCount) {
        this.maxStationValue = stationsCount - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    // установка станции через прямое указание номера
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= minStation && newCurrentStation <= this.maxStationValue) {
            this.currentStation = newCurrentStation;
        }
    }

    // переключение на следующую станцию
    public void nextStation() {
        int currentStation = getCurrentStation();
        if (currentStation == this.maxStationValue) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    // переключение на предыдущую станцию
    public void prevStation() {
        int currentStation = getCurrentStation();
        if (currentStation == minStation) {
            setCurrentStation(this.maxStationValue);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // установка громкости звука
    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume || newVolume > maxVolume) {
            return;
        }

        this.currentVolume = newVolume;
    }

    // увеличение громкости звука
    public void increaseVolume() {
        int currentVolume = getCurrentVolume();
        if (currentVolume >= maxVolume) {
            return;
        }
        setCurrentVolume(currentVolume + 1);
    }

    // уменьшение громкости звука
    public void decreaseVolume() {
        int currentVolume = getCurrentVolume();
        if (currentVolume <= minVolume) {
            return;
        }
        setCurrentVolume(currentVolume - 1);
    }
}

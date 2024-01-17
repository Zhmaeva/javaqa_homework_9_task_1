package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    // установка станции через прямое указание номера
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    // переключение на следующую станцию
    public void nextStation(int currentStation) {
        if (currentStation == 9) {
            this.currentStation = 0;
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    // переключение на предыдущую станцию
    public void prevStation(int currentStation) {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // установка громкости звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // увеличение громкости звука
    public void increaseVolume(int currentVolume) {
        if (currentVolume >= 100) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    // уменьшение громкости звука
    public void decreaseVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}

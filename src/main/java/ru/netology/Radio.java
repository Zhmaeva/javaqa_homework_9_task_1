package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    // установка станции через прямое указание номера
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 || newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    // переключение на следующую станцию
    public void nextStation() {
        int currentStation = getCurrentStation();
        if (currentStation == 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    // переключение на предыдущую станцию
    public void prevStation() {
        int currentStation = getCurrentStation();
        if (currentStation == 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // установка громкости звука
    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0 || newVolume > 100) {
            return;
        }

        this.currentVolume = newVolume;
    }

    // увеличение громкости звука
    public void increaseVolume() {
        int currentVolume = getCurrentVolume();
        if (currentVolume >= 100) {
            return;
        }
        setCurrentVolume(currentVolume + 1);
    }

    // уменьшение громкости звука
    public void decreaseVolume() {
        int currentVolume = getCurrentVolume();
        if (currentVolume <= 0) {
            return;
        }
        setCurrentVolume(currentVolume - 1);
    }
}

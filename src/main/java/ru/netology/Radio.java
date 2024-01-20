package ru.netology;

public class Radio {
    private int minStation = 0;
    private int maxStation = 10;
    private int amountStations = maxStation - 1;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int amountStations) {
        this.amountStations = amountStations;
        this.maxStation = amountStations + 1;
    }

    public Radio() {
        this.maxStation = getMaxStation();
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getAmountStations() {
        return amountStations;
    }

    // установка станции через прямое указание номера
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation || newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    // переключение на следующую станцию
    public void nextStation() {
        int currentStation = getCurrentStation();
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    // переключение на предыдущую станцию
    public void prevStation() {
        int currentStation = getCurrentStation();
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
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

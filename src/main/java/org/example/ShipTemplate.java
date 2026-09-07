package org.example;

public abstract class ShipTemplate {
    private String name;
    private int maxFuel;
    private int currentTankStatus;
    private int maxLoadCapacity;
    private int currentLoadStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getCurrentTankStatus() {
        return currentTankStatus;
    }

    public void setCurrentTankStatus(int currentTankStatus) {
        this.currentTankStatus = currentTankStatus;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getCurrentLoadStatus() {
        return currentLoadStatus;
    }

    public void setCurrentLoadStatus(int currentLoadStatus) {
        this.currentLoadStatus = currentLoadStatus;
    }
}

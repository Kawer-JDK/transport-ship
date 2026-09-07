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
        if (maxFuel > 0) {
            this.maxFuel = maxFuel;
        } else {
            System.out.println("Maximum fuel must be higher than 0!");
        }
    }

    public int getCurrentTankStatus() {
        return currentTankStatus;
    }

    public void setCurrentTankStatus(int currentTankStatus) {
        if (currentTankStatus > maxFuel || maxFuel < 0) {
            System.out.println("Is impossible to tank with this value");
            this.currentTankStatus = this.currentTankStatus; // nie wiedziałem jak tutaj zrobić coś podobnego do break;
        } else {
            this.currentTankStatus = currentTankStatus;
        }
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        if (maxLoadCapacity > 0) {
            this.maxLoadCapacity = maxLoadCapacity;
        } else {
            System.out.println("Maximum load capacity must be higher than 0!");
        }
    }

    public int getCurrentLoadStatus() {
        return currentLoadStatus;
    }

    public void setCurrentLoadStatus(int currentLoadStatus) {
        if (currentLoadStatus > maxLoadCapacity || currentLoadStatus < 0) {
            System.out.println("Is impossible to load ship with this value");
            this.currentLoadStatus = this.currentLoadStatus;
        } else {
            this.currentLoadStatus = currentLoadStatus;
        }
    }
}

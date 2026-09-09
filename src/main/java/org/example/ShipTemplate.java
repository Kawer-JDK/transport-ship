package org.example;

public abstract class ShipTemplate {
    private String name;
    private int maxFuel;
    private int currentTankStatus;
    private int maxLoadCapacity;
    private int currentLoadStatus;
    private int startCurrentCapacity = 0;

    protected ShipTemplate(String name, int maxFuel, int maxLoadCapacity) {
        setName(name);
        setMaxFuel(maxFuel);
        setMaxLoadCapacity(maxLoadCapacity);
        setCurrentTankStatus(maxFuel);
        setCurrentLoadStatus(startCurrentCapacity);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    protected void setMaxFuel(int maxFuel) {
        if (maxFuel >= 0) {
            this.maxFuel = maxFuel;
        } else {
            System.out.println("Maximum fuel must be higher than 0!");
        }
    }

    public int getCurrentTankStatus() {
        return currentTankStatus;
    }

    protected void setCurrentTankStatus(int currentTankStatus) {
        if (currentTankStatus > maxFuel || currentTankStatus < 0) {
            System.out.println("Is impossible to tank with this value");
            return;
        } else {
            this.currentTankStatus = currentTankStatus;
        }
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    protected void setMaxLoadCapacity(int maxLoadCapacity) {
        if (maxLoadCapacity >= 0) {
            this.maxLoadCapacity = maxLoadCapacity;
        } else {
            System.out.println("Maximum load capacity must be higher than 0!");
        }
    }

    public int getCurrentLoadStatus() {
        return currentLoadStatus;
    }

    protected void setCurrentLoadStatus(int currentLoadStatus) {
        if (currentLoadStatus > maxLoadCapacity || currentLoadStatus < 0) {
            System.out.println("Is impossible to load ship with this value");
            return;
        } else {
            this.currentLoadStatus = currentLoadStatus;
        }
    }
}

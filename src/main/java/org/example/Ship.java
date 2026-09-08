package org.example;

public class Ship extends ShipTemplate {
    private int startCurrentCapacity = 0;

    public Ship(String name, int maxFuel, int maxLoadCapacity) {
        super(name, maxFuel, maxLoadCapacity);
    }

    public void tankFuel(int tankFuel) {
        this.setCurrentTankStatus(getCurrentTankStatus() + tankFuel);
    }

    public void consumeFuel(int consumeFuel) {
        this.setCurrentTankStatus(getCurrentTankStatus() - consumeFuel);
    }

    public void loadCargo(int loadCargo) {
        this.setCurrentLoadStatus(getCurrentLoadStatus() + loadCargo);
    }

    public void unloadCargo(int unloadCargo) {
        this.setCurrentLoadStatus(getCurrentLoadStatus() - unloadCargo);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name=" + getName() +
                ", fuel=" + getCurrentTankStatus() + "/" + getMaxFuel() +
                ", cargo=" + getCurrentLoadStatus() + "/" + getMaxLoadCapacity() +
                '}';
    }
}

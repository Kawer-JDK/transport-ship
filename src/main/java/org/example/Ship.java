package org.example;

public class Ship extends ShipTemplate {

    public Ship(String name, int maxFuel, int maxLoadCapacity) {
        super(name, maxFuel, maxLoadCapacity);
    }

    public void tankFuel(int tankFuel) {
        if (tankFuel >= 0) {
            this.setCurrentTankStatus(getCurrentTankStatus() + tankFuel);
        } else {
            System.out.println("It's impossible to tank this value of fuel");
        }
    }

    public void consumeFuel(int consumeFuel) {
        if (consumeFuel >= 0) {
            this.setCurrentTankStatus(getCurrentTankStatus() - consumeFuel);
        } else {
            System.out.println("It's impossible to consumeFuel with this value of fuel");
        }
    }

    public void loadCargo(int loadCargo) {
        if (loadCargo >= 0) {
            this.setCurrentLoadStatus(getCurrentLoadStatus() + loadCargo);
        } else {
            System.out.println("It's impossible to load this value of cargo");
        }
    }

    public void unloadCargo(int unloadCargo) {
        if (unloadCargo >= 0) {
            this.setCurrentLoadStatus(getCurrentLoadStatus() - unloadCargo);
        } else {
            System.out.println("It's impossible to unload this value of cargo");
        }
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

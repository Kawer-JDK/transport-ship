package org.example;

public class Ship extends ShipTemplate {
    private int startFuel = 100;
    private int startCurrentCapacity = 0;

    public Ship(String name, int maxLoadCapacity) {
        super.setName(name);
        super.setMaxFuel(startFuel);
        super.setMaxLoadCapacity(maxLoadCapacity);
        super.setCurrentTankStatus(startFuel);
        super.setCurrentLoadStatus(startCurrentCapacity);
    }

    public void shipUpdate(int tankFuel, int fuelConsumption, int loadMass, int unloadMass) {
        this.setCurrentTankStatus(getCurrentTankStatus() + tankFuel);
        this.setCurrentTankStatus(getCurrentTankStatus() - fuelConsumption);
        this.setCurrentLoadStatus(getCurrentLoadStatus() + loadMass);
        this.setCurrentLoadStatus(getCurrentLoadStatus() - unloadMass);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name=" + super.getName() +
                ", fuel=" + super.getCurrentTankStatus() + " / " + super.getMaxFuel() +
                ", cargo=" + super.getCurrentLoadStatus() + " / " + super.getMaxLoadCapacity() +
                '}';
    }
}

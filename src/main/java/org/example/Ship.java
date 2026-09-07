package org.example;

public class Ship extends ShipTemplate {
    private int startCurrentCapacity = 0;

    public Ship(String name, int maxFuel, int maxLoadCapacity) {
        super.setName(name);
        super.setMaxFuel(maxFuel);
        super.setMaxLoadCapacity(maxLoadCapacity);
        super.setCurrentTankStatus(maxFuel);
        super.setCurrentLoadStatus(startCurrentCapacity);
    }

    public void shipUpdateFuel(int tankFuel, int fuelConsumption) {
        this.setCurrentTankStatus(getCurrentTankStatus() + tankFuel);
        this.setCurrentTankStatus(getCurrentTankStatus() - fuelConsumption);
    }

    public void shipUpdateCargo(int loadCargo, int unloadCargo) {
        this.setCurrentLoadStatus(getCurrentLoadStatus() + loadCargo);
        this.setCurrentLoadStatus(getCurrentLoadStatus() - unloadCargo);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name=" + super.getName() +
                ", fuel=" + super.getCurrentTankStatus() + "/" + super.getMaxFuel() +
                ", cargo=" + super.getCurrentLoadStatus() + "/" + super.getMaxLoadCapacity() +
                '}';
    }
}

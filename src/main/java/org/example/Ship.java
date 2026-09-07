package org.example;

public class Ship extends ShipTemplate {
    private int startFuel = 100;
    private int startCurrentCapacity = 0;

    public Ship(String name, int maxFuel, int maxLoadCapacity) {
        super.setName(name);
        super.setMaxFuel(maxFuel);
        super.setMaxLoadCapacity(maxLoadCapacity);
        super.setCurrentTankStatus(startFuel);
        super.setCurrentLoadStatus(startCurrentCapacity);
    }
}

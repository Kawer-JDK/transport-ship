package org.example;

public class Main {
    static void main() {
        Ship ship = new Ship("Niszczyciel", 150, 5000);
        ship.loadCargo(-1000);
        System.out.println(ship);
        ship.loadCargo(6000);
        System.out.println(ship);
        ship.loadCargo(4000);
        System.out.println(ship);
        ship.unloadCargo(5000);
        System.out.println(ship);
    }
    }

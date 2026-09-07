package org.example;

public class Main {
    static void main() {
        Ship ship = new Ship("Niszczyciel", 150, 5000);
        String a = ship.toString();
        System.out.println(a);

        ship.shipUpdateFuel(0, 100);
        String b = ship.toString();
        System.out.println(b);
    }
    }

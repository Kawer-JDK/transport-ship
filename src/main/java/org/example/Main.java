package org.example;

public class Main {
    static void main() {
        Ship ship = new Ship("Niszczyciel", 150, 5000);
        String a = ship.toString();
        System.out.println(a);

        ship.shipUpdateFuel(0, 100);
        String b = ship.toString();
        System.out.println(b);

        ship.shipUpdateCargo(4500, 0);
        String c = ship.toString();
        System.out.println(c);

        ship.shipUpdateCargo(1000, 0);
        String d = ship.toString();
        System.out.println(d);
    }
    }

package org.example;

public abstract class CargoTemplate {
    private String name;
    private int weight;

    protected CargoTemplate(String name, int weight) {
        this.name = name;
        if (weight < 0) {
            System.out.println("It's impossible to have this value of Cargo");
        } else {
            this.weight = weight;
        }
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            return;
        }
    }

    public int getWeight() {
        return weight;
    }
}

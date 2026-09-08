package org.example;

public abstract class CargoTemplate {
    private String name;
    private int weight;

    protected CargoTemplate(String name, int weight) {
        this.name = name;
        this.weight = weight;
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

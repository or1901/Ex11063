package com.example.ex11063;

public class State {
    private String name, capital, population;
    private int imageId;

    public State(String name, String capital, int imageId, String population) {
        this.name = name;
        this.capital = capital;
        this.imageId = imageId;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public String getCapital() {
        return this.capital;
    }

    public int getImageId() {
        return this.imageId;
    }

    public String getPopulation() {
        return this.population;
    }
}

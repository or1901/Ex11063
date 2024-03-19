package com.example.ex11063;

public class State {
    private String name, capital;
    private int imageId, population;

    public State(String name, String capital, int imageId, int population) {
        this.name = name;
        this.capital = capital;
        this.imageId = imageId;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getImageId() {
        return this.imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

package com.example.ex11063;

/**
 * State class:
 * saves the data of each state which is displayed in the main activity's spinner.
 * @author Ori Roitzaid <or1901 @ bs.amalnet.k12.il>
 * @version	1
 * @since 19/3/2024
 */
public class State {
    private String name, capital, population;
    private int imageId;

    /**
     * A constructor which initializes the State object with given values.
     * @param name The State's name.
     * @param capital The State's capital city.
     * @param imageId The image id of the State's flag.
     * @param population The State's population.
     */
    public State(String name, String capital, int imageId, String population) {
        this.name = name;
        this.capital = capital;
        this.imageId = imageId;
        this.population = population;
    }

    /**
     * This function gets the State's name.
     * @return The State's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * This function gets the State's capital.
     * @return The State's capital.
     */
    public String getCapital() {
        return this.capital;
    }

    /**
     * This function gets the image id of the State's flag.
     * @return The image id of the State's flag.
     */
    public int getImageId() {
        return this.imageId;
    }

    /**
     * This function gets the State's population.
     * @return The State's population.
     */
    public String getPopulation() {
        return this.population;
    }
}

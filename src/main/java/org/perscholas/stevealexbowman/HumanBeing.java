package org.perscholas.stevealexbowman;

public class HumanBeing {

    private float weight;  // declaring a variable named weight of float type that has private/class-only access
    private float height;  // declaring a variable named height of float type that has private/class-only access
    private float bmi;  // declaring a variable named bmi of float type that has private/class-only access

    // 1st constructor that has 3 parameters as the argument i.e., weight, height, bmi
    // binding the arguments with the `this` keyword
    public HumanBeing(float weight, float height, float bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    // 2nd constructor method
    public HumanBeing() {

    }

    // Getters/Accessors and Setters/Mutators for weight, height, and bmi
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }
}


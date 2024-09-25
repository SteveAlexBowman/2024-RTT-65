package org.perscholas.stevealexbowman;

public abstract class Shape {
    protected String color;
    protected double height; // to hold height
    protected double width; // to hold width
    protected double base; // to hold base

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // The getArea method is abstract
    // It must be overridden in a subclass
    // All shapes must provide a method called getArea()

    public abstract double getArea();
        // Returns a self-descriptive string

    public String toString() {
        return "Shap[color=" + color + "]";
    }

    public void displayshapName() {
        System.out.println("I am a Shape");
    }
}

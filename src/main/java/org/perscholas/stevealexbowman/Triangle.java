package org.perscholas.stevealexbowman;

public class Triangle extends Shape {
    public Triangle() {}

    public Triangle(String color) {
        this.color = color;
    }
    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * super.base * super.height;
    }

    // Overriding method of base class with different implementations
    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle");
    }

    // Returns a self-descriptive string
    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height " + height + "," + super.toString() + "]";
    }
}

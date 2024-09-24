package org.perscholas.stevealexbowman;

public class Rectangle extends Shape {

    public Rectangle (String color) {
        super.color = color;
    }
    public Rectangle() {

    }

    public Rectangle(String color, double width, double height) {
        super.color = color;
        super.width = width;
        super.height = height;
    }

    @Override
    public double getArea() {
        return super.width * super.height;
    }

    // Overriding method of base class with different implementation

    @Override
    public void displayshapName(){
        System.out.println("I am a Rectangle");
    }

    // Returns a self-descriptive string

    @Override
    public String toString() {
        return "Rectangle[height=" + height + ", width=" + width + "," + super.toString() + "]";
    }
}

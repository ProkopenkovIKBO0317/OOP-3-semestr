package com.company;

public abstract class  Shape {

    // Var of abstract class Shape
    protected String color;
    protected boolean filled;

    // Constructors
    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Abstract methods
    abstract double getArea();
    abstract double getPerimeter();
    abstract void ToString();
}

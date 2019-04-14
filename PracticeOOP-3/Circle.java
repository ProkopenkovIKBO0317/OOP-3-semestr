package com.company;

public class Circle extends Shape {

    // Var of class Circle
    protected double radius;

    // Constructors
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // Getters
    public double getRadius() {
        return radius;
    }

    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Methods
    @Override
    double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    void ToString() {
        System.out.println("Area "+getArea() + " , Perimetr " +getPerimeter());
    }
}

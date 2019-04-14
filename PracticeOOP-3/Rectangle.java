package com.company;

public class Rectangle extends Shape {

    // Var of class Rectangle
    protected double width, length;

    //Constructors
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Methods
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return width*2+length*2;
    }

    @Override
    void ToString() {
        System.out.println("Area "+getArea() + " , Perimetr " +getPerimeter());
    }
}

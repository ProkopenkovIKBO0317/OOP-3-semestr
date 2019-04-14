package ru.mirea.pr1;

public class Ball {
    private String color;
    private double radius;
    private String type;

    public Ball(){}

    public Ball(String type, String color, double radius) {
        this.type = type;
        this.color = color;
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printInfo() {
        System.out.println("Тип мяча: "+ this.type+
                ", цвет: "+this.color + ", радиус: " + this.radius);
    }
}

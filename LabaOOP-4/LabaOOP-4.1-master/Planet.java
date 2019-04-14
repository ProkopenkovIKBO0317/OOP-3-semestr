package com.company;

class Planet implements Nameable {
    private String name;
    private double farToSun;
    private int radius;
    private int tempDay;
    private int tempNight;

    public Planet(String name, double farToSun, int radius, int tempDay, int tempNight) {
        this.name = name;
        this.farToSun = farToSun;
        this.radius = radius;
        this.tempDay = tempDay;
        this.tempNight = tempNight;
    }

    public void printInfo() {
        System.out.print("\nName: " + name + "\nDistance to Sun: " + farToSun+" million kilometers"
                + "\nRadius: " + radius + " kilometers" +
                "\nDay temperature: " +tempDay+ " C°" + "\nNight temperature: " + tempNight + " C°");
    }

    public String getName() { return name; }
}

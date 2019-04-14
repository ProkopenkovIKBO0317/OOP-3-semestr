package com.company;

public class TesterShape {

    public static void main(String[] args) {

        Circle c1 = new Circle("RED", false, 5.5);
        System.out.println("The first circle");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        c1.ToString();
        
        System.out.println();
        
        Rectangle r1 = new Rectangle("GREEN", true, 10, 5);
        System.out.println("The first Rectangle");
        System.out.println(r1.getWidth());
        System.out.println(r1.getWidth());
        System.out.println(r1.getColor());
        System.out.println(r1.isFilled());
        r1.ToString();
    }

}

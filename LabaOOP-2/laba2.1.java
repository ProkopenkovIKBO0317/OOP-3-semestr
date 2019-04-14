package com.company;

import Circles.Circles;

public class Main {

    public static void main(String[] args) {
        Circles o1 = new Circles();
        o1.printCircle(); // Окржуность с центром (0.0;0.0) и радиусом 1.0
        Circles o2 = new Circles(1, -4,2);
        Circles o3 = new Circles(5,3,3);
        o2.printCircle();
        System.out.println("Площадь окружности о2: "+o2.squareCircle());
        System.out.println("Площадь окружности о3: "+o3.squareCircle());
    }
}

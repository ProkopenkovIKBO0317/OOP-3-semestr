package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        Planet p1 = new Planet("Mercury", 58,2439, 430, -183);
        Planet p2 = new Planet("Venus", 108, 6052, 465, 475);
        Planet p3 = new Planet("Earth", 150, 6371, 15, 7);
        Planet p4 = new Planet("Mars", 228, 3389, 20, -125);
        Planet p5 = new Planet("Jupiter", 778, 71492, -145, -150);
        Planet p6 = new Planet("Saturn", 1.43, 58232, -113, -173);
        Planet p7 = new Planet("Uranus", 2.88, 25360, -224, -216);
        Planet p8 = new Planet("Neptune", 4.5, 24622, -200, -200);


        System.out.println("1. " + p1.getName()); System.out.println("2. " + p2.getName());
        System.out.println("3. " + p3.getName()); System.out.println("4. " + p4.getName());
        System.out.println("5. " + p5.getName()); System.out.println("6. " + p6.getName());
        System.out.println("7. " + p7.getName()); System.out.println("8. " + p8.getName());
        System.out.print("What about planet do you want to know? --> ");

        choose = sc.nextInt();
        switch(choose) {
            case 1:
                p1.printInfo();
                break;
            case 2:
                p2.printInfo();
                break;
            case 3:
                p3.printInfo();
                break;
            case 4:
                p4.printInfo();
                break;
            case 5:
                p5.printInfo();
                break;
            case 6:
                p6.printInfo();
                break;
            case 7:
                p7.printInfo();
                break;
            case 8:
                p8.printInfo();
                break;
                default:
                    System.out.println("This is symbol is not supported");
                    break;
        }

    }
}

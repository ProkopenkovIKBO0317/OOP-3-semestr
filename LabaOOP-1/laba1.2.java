package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как Вас зовут?");

        String line = sc.nextLine();
        System.out.println("Здравствуйте, " + line);
    }
}

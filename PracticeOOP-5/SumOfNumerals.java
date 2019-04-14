package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;                                       // Натуральное число N
        int sum = 0;                                 // Сумма цифр числа N
        Scanner sc = new Scanner (System.in);       

        try {
            System.out.print("Enter number N: ");
            n = sc.nextInt();

            while (n != 0) {
                sum += n % 10;
                n /= 10;
                
            }

            System.out.println("Sum numerals is " + sum);

        } catch (Exception e) {
            System.out.println("Incorrect data entry!");
            System.exit(0);
            
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n = 0;      // натуральное число
        int check = 0;  // переменная для выхода из цикла

        while (check == 0) {
            try {
                System.out.print("Enter natural number N: ");
                n = enter.nextInt();
                if (n > 0) {check++;}
                else {
                    System.out.print("Number N must be > 0!");
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Incorrect data entry!");
                System.exit(0);
            }
        }

        // вывод целых числе от 1 до N
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

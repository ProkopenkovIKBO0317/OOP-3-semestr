package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n;
	System.out.print("Введите число, факториал которого хотите посчитать: ");
	n = sc.nextInt();
	System.out.print("Факториал числа равен ");
	System.out.print(factorial(n));
    }

    public static int factorial(int n){
    	int f = 1;
    	for(int i = 1; i <= n; i++)
	    f *= i;
    	return f;
	}

}

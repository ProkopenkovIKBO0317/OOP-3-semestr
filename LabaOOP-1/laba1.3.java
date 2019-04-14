package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
	    int length;
	    float sum = 0;
	    System.out.print("Введите длину массива: ");
	    length = sc.nextInt();
	    for(double i = 1; i <= length; i++)
	        sum += 1/i;
	    System.out.print(sum);
    }
}

package com.company;
import java.util.Random;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	Random row = new Random(10);
	int m[] = new int[10];
		System.out.println("Исходный массив");
	for (int i = 0; i < m.length; i++){
		m[i] = (int)(Math.random()*50);
		System.out.print(m[i] + " ");
	}
		Arrays.sort(m);
		System.out.println();
		System.out.println("Отсортированный массив");
	for (int i = 0; i < m.length; i++)
		System.out.print(m[i] + " ");

    }
}

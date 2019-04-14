package ru.mirea.lab3;

import java.util.Scanner;

public class TesterMe6eLb {

    public static void main(String[] args) {
        Tables tb = new Tables("Деревянный",
                "Коричневыйы",
                "Кухонный");
        Chairs c = new Chairs("Металличекий",
                "Красный",
                "для кухни");
        int ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Что бы вы хотели приобрести?");


        System.out.print("1. ");
        System.out.println(tb);

        System.out.print("2. ");
        System.out.println(c);
        System.out.print("пишите здесь ->");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Благодарим Вас за покупку!");
                break;

            case 2:
                System.out.println("Благодарим Вас за покупку!");
                break;

                default: System.out.println("Данный символ не поддерживается.");
        }
    }
}

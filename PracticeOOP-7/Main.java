package mirea;

import java.util.Scanner;
import java.util.ArrayDeque;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> first = new ArrayDeque<>();
        ArrayDeque<Integer> second = new ArrayDeque<>();
        System.out.println("Enter numbers for 1st player\n");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + " number: ");
            first.add(sc.nextInt());
            if (first.peek() > 9) {
                System.out.println("Number must be only from 0 to 9!");
                System.exit(0);
            }
        }
        System.out.println("\nEnter numbers for 2nd player\n");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + " number: ");
            second.add(sc.nextInt());
            if (second.peek() > 9) {
                System.out.println("Number must be from 0 to 9! Restart the programme!");
                System.exit(0);
            }
        }

        System.out.println("\nFirst player - " + first);
        System.out.println("Second player - " + second + "\n");

        Game(first, second);

    }

    static void Game(ArrayDeque<Integer> deq1, ArrayDeque<Integer> deq2) {
        int step = 0;

        while(!(deq1.isEmpty() || deq2.isEmpty())) {
            if (step >= 106) {
                break;
            }

            if (deq1.peek() == 0 && deq2.peek() == 9) {
                deq1.add(deq1.pop());
                deq1.add(deq2.pop());

            } else if (deq1.peek() == 9 && deq2.peek() == 0) {
                deq2.add(deq2.pop());
                deq2.add(deq1.pop());
            } else if (deq1.peek() > deq2.peek()) {
                deq1.add(deq1.pop());
                deq2.add(deq2.pop());
            } else if (deq1.peek() < deq2.peek()) {
                deq2.add(deq2.pop());
                deq2.add(deq1.pop());
            }
            step++;

            System.out.println("Step #" + step + "\nPlayer 1: " + deq1 + "\nPlayer 2: " + deq2 + "\n");

            if (deq1.isEmpty()) {
                System.out.println("Second player is a WINNER! Congratulations! Steps = " + step);
            } else if (deq2.isEmpty()) {
                System.out.println("First player is a WINNER! Congratulations! Steps = " + step);
            } else if (deq1.isEmpty() || deq2.isEmpty())System.out.println("BOTVA");
        }

    }
}


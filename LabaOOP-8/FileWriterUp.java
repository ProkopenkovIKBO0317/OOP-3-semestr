package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String someMessage;

        System.out.println("Enter some message to write this message in the file.");
        someMessage = sc.nextLine();

        try(FileWriter fw = new FileWriter("E:\\Programes\\userMessage.txt", false)) {
            fw.write(someMessage);
            fw.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

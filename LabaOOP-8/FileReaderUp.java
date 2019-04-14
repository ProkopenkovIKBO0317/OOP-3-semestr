package com.company;

import java.io.*;

public class FileReadUP {
    public static void main(String[] args) {
        try(FileReader rf = new FileReader("E:\\Programes\\file1.txt")) {
            int c;
            while((c = rf.read()) != -1) {
                System.out.print((char)c);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

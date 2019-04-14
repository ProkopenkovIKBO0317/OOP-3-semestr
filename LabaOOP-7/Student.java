package com.company;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

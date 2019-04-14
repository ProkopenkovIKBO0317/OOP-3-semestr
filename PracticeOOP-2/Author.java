package com.company;

public class Author {

    // var of Author
    private String name, email;
    private char gender;

    //Constructor with parameters
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Methods of class Author
    public void ToString() {
        System.out.println(name + " (" + gender + ") at " + email);
    }


}

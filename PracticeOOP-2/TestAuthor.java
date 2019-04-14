package com.company;

public class TestAuthor {

    public static void main(String[] args) {

        Author a1 = new Author("Aleksandr Pushkin", "apushkin@yandex.ru", 'M');
        Author a2 = new Author("Azek Asiimov", "asiimov555@gmail.com", 'M');
        Author a3 = new Author("Fedor Dostoevsky", "fdostoevsky@mail.ru", 'M');

        a1.ToString();
        a2.ToString();
        a3.ToString();


    }

}

package com.company;
import Book.Book;


public class Main {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Book book = new Book();
        //System.out.print("Какой автор? : ");
        //book.author = sc.nextLine();
        book.setAuthor("Azek Asiimov");
        book.setBookname("I'm, Robot");
        book.setYear(1986);
        //System.out.print("Выберите название книги: ");
        //book.bookname = sc.nextLine();
        //System.out.print("Год издания книги: ");
        //book.year = sc.nextInt();
        System.out.println("Ваша книга ");
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getBookname());
        System.out.println("Год издания: " + book.getYear());
    }
}

package ru.mirea.pr1;

public class TesterBook {

    public static void main(String[] args) {
        Book book = new Book("I, robot", "Isaac Asimov", 318, 1950);

        Book book1 = new Book("Третье человечество", "Бернар Вербер", 540, 2018);

        book.printInfo();
        book1.printInfo();
    }

}

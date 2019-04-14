package ru.mirea.lab4;

public class Tester {

    public static void main(String[] args) {
        Car c1	=	new Car("Mercedes-Benz",	"E-class",	"E250 Sport",	3558047,
                2017);
        c1.println();

        Car	c2	=	new	Car("BMW",	"7	Series",
                "750	Li",	7050000,	2016);
        c2.println();

        Car	c3	=	new	Car("Audi",	"A8",	"Long",	7450000,	2016);
        c3.println();
    }
}

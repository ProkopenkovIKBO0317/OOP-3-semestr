package ru.mirea.pr1;

public class Tester {

    public static void main(String[] args) {
        Ball ball = new Ball("Футбольный", "черно-белый", 11);
        Ball ball2 = new Ball();

        ball2.setType("Волейбольный");
        ball2.setColor("желтый в синюю полоску");
        ball2.setRadius(9);

        ball.printInfo();
        ball2.printInfo();
    }

}

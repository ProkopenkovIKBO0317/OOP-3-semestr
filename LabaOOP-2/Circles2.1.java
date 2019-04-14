package Circles;

public class Circles {
    public double x; // абцисса центра
    public double y; // ордината центра
    public double r; // радиус окружности

    // методы класса
    // выводит на экран параметры окружности
    public double squareCircle() {
        double s = Math.PI * r * r;
        return s;
    }

    public void printCircle() {
        System.out.println("Окружность с центром ("+x+"; "+y+") и радиусом "+r);
    }
    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    public void zoomCircle(double k) {
        r = r * k;
    }

    // Конструктор по умолчанию, теперь сразу после создания объекта будем
    // получать окружность единичного радиуса с центром в начале координат
    public Circles() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }

    // Конструктор с параметрами в дополнение к конструктору по умолчанию
    public Circles(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}

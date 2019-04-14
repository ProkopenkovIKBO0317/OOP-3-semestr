package Human;

public class Human {
    public double height;
    public double weight;

    public Human(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void printHuman() {
        System.out.println("Человек с ростом "+height+" сантиметров и весом "+weight+" кило");
    }
}



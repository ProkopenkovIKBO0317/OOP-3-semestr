package Head;

public class Head {
    public String hair;
    public String eyes;

    public Head(String hair, String eyes) {
        this.hair = hair;
        this.eyes = eyes;
    }

    public void printHead() {
        System.out.println(hair+" волосы, " +eyes+" глаза.");
    }
}

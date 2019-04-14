package ru.mirea.lab3;

public class Chairs extends Me6eLb {
    private String use;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public Chairs(String material, String color, String use) {
        super(material, color);
        this.use = use;
    }


    public String toString () {
        return "Стул { " + "Назначение: " + use + ", Материал: " + material +
                ", Цвет: " + color + " }";
    }
}

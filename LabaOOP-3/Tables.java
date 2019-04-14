package ru.mirea.lab3;

public class Tables extends Me6eLb {
    private String use;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public Tables(String material, String color, String use) {
        super(material, color);
        this.use = use;
    }

    public String toString() {
        return "Стол { " + "Назначение: " + use + ", Материал: " + material +
                ", Цвет: " + color + " }";
    }
}

package ru.mirea.lab3;

public abstract class Me6eLb {
    protected String material;
    protected String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Me6eLb(String material, String color) {
        this.material = material;
        this.color = color;
    }
}

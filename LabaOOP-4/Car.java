package ru.mirea.lab4;

public class Car implements Printable { // implements значит что данный класс реализует
    String brand;
    String model;
    String configuration;
    int price;
    int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String brand, String model, String configuration, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.configuration = configuration;
        this.price = price;
        this.year = year;
    }

    public void println() {
        System.out.println("Автомобиль	марки:	"	+brand+
                "	Модель:	"	+model+	"	Конфигурация:	"	+configuration+
                "	Цена	"	+price+	"	Год	выпуска:"	+year);
    }
}

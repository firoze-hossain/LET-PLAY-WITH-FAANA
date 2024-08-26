package com.roze.faana.java.copyObjects;

public class Car {
    private String name;
    private String model;
    private String year;

    public Car(String name, String model, String year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public Car(Car c) {
        this.copy(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void copy(Car c) {
        this.setModel(c.getModel());
        this.setName(c.getName());
        this.setYear(c.getYear());
    }
}

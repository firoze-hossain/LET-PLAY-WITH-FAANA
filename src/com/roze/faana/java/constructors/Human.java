package com.roze.faana.java.constructors;

public class Human {
    String name;
    int age;
    double weight;

    Human(String n, int a, int w) {
        this.name = n;
        this.age = a;
        this.weight = w;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

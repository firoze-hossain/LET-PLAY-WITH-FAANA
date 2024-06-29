package com.roze.faana.java.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        Bicycle bicycle = new Bicycle();
        bicycle.stop();
        System.out.println(car.door);
        System.out.println(bicycle.wheels);
    }
}

package com.roze.faana.java.object;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name + " " + car.model + " " + car.color + " " + car.price + " " + car.year);
        car.brake();
        car.drive();
    }
}

package com.roze.faana.java.encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("BMW","B23","Red");
        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println("********************");
        car.setName("Toyota");
        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
    }
}

package com.roze.faana.java.copyObjects;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "B23", "2019");
        //Car car2 = new Car("Maruti", "M99", "2023");
        //car2.copy(car1);
        Car car2 = new Car(car1);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("***********");
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println("**********");
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
    usual route fiscal meadow crash stadium before smoke hollow answer where hint mesh tower enroll street tortoise okay sibling close review fruit thing slogan hat
}

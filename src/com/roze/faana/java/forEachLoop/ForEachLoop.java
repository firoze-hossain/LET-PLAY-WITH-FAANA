package com.roze.faana.java.forEachLoop;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        //it is a traversing technique through array/collections
        //it takes less steps and more readable
        //it is less flexible
        String[] animals = {"Bird", "Cat", "Cow", "Goat"};
        System.out.println("Birds List: ");
        for (String i : animals) {
            System.out.println(i);
        }
        System.out.println("*****************************");
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Roles Royce");
        cars.add("Coralla");
        cars.add("Bench Mars");
        System.out.println("Cars List: ");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}

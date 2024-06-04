package com.roze.faana.java.array;

public class ArrayExample {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Tesla", "Pajero"};
        System.out.println(cars[2]);
        System.out.println("**************");
        String[] flower = new String[4];
        flower[0] = "Rose";
        flower[1] = "Sunflower";
        flower[2] = "Poppy";
        flower[3] = "Jasmine";
        System.out.println(flower[1]);
        System.out.println("************");
        for (int i = 0; i < flower.length; i++) {
            System.out.println(flower[i]);
        }
    }
}

package com.roze.faana.java.arrayList;

import java.util.ArrayList;

/* ArrayList is a collection
 * It can add abd remove elements after compilation
 * it is used with reference data types
 * It is a resizeable array
 * */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("Rice");
        food.add("Noodles");
        food.add("Fish");
        food.add("Meat");

        food.set(2, "Burger");
        food.remove(3);
        // food.clear();


        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}

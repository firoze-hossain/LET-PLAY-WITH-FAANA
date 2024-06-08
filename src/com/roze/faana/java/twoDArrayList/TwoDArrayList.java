package com.roze.faana.java.twoDArrayList;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        //it is a dynamic list of lists
        //we increase size during runtime
        ArrayList<ArrayList<String>> foodItems = new ArrayList<>();

        ArrayList<String> firstFood = new ArrayList<>();
        firstFood.add("Burger");
        firstFood.add("Pizza");
        firstFood.add("Noodles");

        ArrayList<String> setMenu = new ArrayList<>();
        setMenu.add("Fried Rize");
        setMenu.add("Biriyani");
        setMenu.add("Chicken Polau");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Lemon Mint");
        drinks.add("Melon Juice");
        drinks.add("Mojo");

        foodItems.add(firstFood);
        foodItems.add(setMenu);
        foodItems.add(drinks);

        System.out.println(foodItems.get(0).get(2));

    }
}

package com.roze.faana.java.arrayOfObject;

public class Main {
    public static void main(String[] args) {
        //Food[] foodItems = new Food[3];
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Chicken Fry");
        Food[] foodItems = {food1, food2, food3};
//        foodItems[0] = food1;
//        foodItems[1] = food2;
//        foodItems[2] = food3;
        System.out.println(foodItems[0].name);
        System.out.println(foodItems[1].name);
        System.out.println(foodItems[2].name);


    }
}

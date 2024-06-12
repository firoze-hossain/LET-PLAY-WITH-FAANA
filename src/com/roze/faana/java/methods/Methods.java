package com.roze.faana.java.methods;

public class Methods {
    public static void main(String[] args) {
        String name = "Firoze";
        int age = 27;
        displayName(name, age);
        int x = 20;
        int y = 5;
        int result = add(x, y);
        System.out.println(result);
    }

    public static void displayName(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}

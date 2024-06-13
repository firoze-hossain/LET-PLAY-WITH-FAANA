package com.roze.faana.java.overloadedMethods;

public class OverloadedMethods {
    public static void main(String[] args) {
        int intResult = add(1, 2, 4);
        System.out.println(intResult);
        double doubleResult = add(1, 2.6, 4.9);
        System.out.println(doubleResult);
    }

    static int add(int x, int y) {
        System.out.println("Overloaded method #1");
        return x + y;
    }

    static int add(int x, int y, int z) {
        System.out.println("Overloaded method #2");
        return x + y + z;
    }

    static int add(int x, int y, int z, int w) {
        System.out.println("Overloaded method #3");
        return x + y + z + w;
    }

    static double add(double x, double y) {
        System.out.println("Overloaded method #4");
        return x + y;
    }

    static double add(double x, double y, double z) {
        System.out.println("Overloaded method #4");
        return x + y + z;
    }

    static double add(double x, double y, double z, double w) {
        System.out.println("Overloaded method #6");
        return x + y + z + w;
    }
}

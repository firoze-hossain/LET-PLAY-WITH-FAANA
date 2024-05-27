package com.roze.faana.java.swapTwoVariables;

public class SwapTwoVariables {
    public static void main(String[] args) {
        String x = "Milk";
        String y = "Water";
        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}

package com.roze.faana.java.mathClass;

import java.util.Scanner;

public class HypotenuseOfTriangle {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value x side: ");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y side: ");
        y = scanner.nextDouble();
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The the value of Hypotenuse: " + z);
    }
}

package com.roze.faana.java.mathClass;

public class MathClass {
    public static void main(String[] args) {
        double x = 30.46;
        double y = -100;
        double z = 100;
        double result = Math.max(x, y);
        System.out.println("Maximum Number: " + result);
        result = Math.min(x, y);
        System.out.println("Minimum number: " + result);
        result = Math.abs(y);
        System.out.println("Absolute value of : " + result);
        result = Math.round(x);
        System.out.println("The rounded value: " + result);
        result = Math.ceil(x);
        System.out.println("The ceil upper rounded value: " + result);
        result = Math.floor(x);
        System.out.println("The floor lower rounded value: " + result);
        result = Math.sqrt(y);//this will return NaN value, as if y is negative value
        System.out.println("The squared value: " + result);
        result = Math.sqrt(z);
        System.out.println("The squared value: " + result);
    }
}

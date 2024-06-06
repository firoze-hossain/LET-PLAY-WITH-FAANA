package com.roze.faana.java.wrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        /* The way to process primitive data types as reference data types
         * It has some useful methods for different operations
         * It takes more time to access data than primitive
         * It is used with collections
         * Autoboxing: Convert primitive to Wrapper Object
         * Unboxing: The reverse of autoboxing
         * */
        Boolean b = true;
        Double d = 3.125;
        Character c = 'A';
        if (c == 'A') {
            System.out.println("This is true");
        }
    }
}

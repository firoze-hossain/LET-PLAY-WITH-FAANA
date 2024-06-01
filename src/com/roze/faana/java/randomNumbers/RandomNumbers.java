package com.roze.faana.java.randomNumbers;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        // int intRandom=random.nextInt();
        //this will generate random number from 1-6
        int intRandom = random.nextInt(6) + 1;
        System.out.println("int random value = " + intRandom);
        //the range of nextDouble random method by default 0-1
        double doubleRandom = random.nextDouble();
        System.out.println("Double random value = " + doubleRandom);
        boolean booleanRandom = random.nextBoolean();
        System.out.println("Boolean random value = " + booleanRandom);
    }
}

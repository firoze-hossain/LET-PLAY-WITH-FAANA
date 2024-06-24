package com.roze.faana.java.variableScope;

import java.util.Random;

public class DiceRoller {
    //local variable scope
//    DiceRoller(){
//        Random random=new Random();
//        int number=0;
//        roll(random,number);
//    }
//
//    private void roll(Random random, int number) {
//        number=random.nextInt(6)+1;
//        System.out.println(number);
//    }

    //global variable scope
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }

    private void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}

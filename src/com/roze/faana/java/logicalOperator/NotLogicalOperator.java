package com.roze.faana.java.logicalOperator;

import java.util.Scanner;

public class NotLogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are playing game.Press q or Q to quit the game!!");
        String response = sc.next();
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You still playing the game");
        } else {
            System.out.println("You quit the game");
        }
    }
}

package com.roze.faana.java.logicalOperator;

import java.util.Scanner;

public class OrLogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are playing game. Quit game press q or Q: ");
        String response = sc.next();
        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You playing game still");
        }

    }
}

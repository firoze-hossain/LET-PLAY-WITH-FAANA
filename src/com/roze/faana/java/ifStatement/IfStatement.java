package com.roze.faana.java.ifStatement;

public class IfStatement {
    public static void main(String[] args) {
        int age = 35;
        if (age >= 18) {
            System.out.println("You are adult");
        } else if (age == 35) {
            System.out.println("Middle aged man");
        } else if (age >= 60) {
            System.out.println("You are old");
        } else if (age <= 13) {
            System.out.println("You are teenager");
        } else {
            System.out.println("You are not adult");
        }
    }
}

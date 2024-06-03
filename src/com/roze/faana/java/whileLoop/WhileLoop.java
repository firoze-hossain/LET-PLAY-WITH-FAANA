package com.roze.faana.java.whileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        while (name.isBlank()) {
            System.out.print("Enter Your name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello " + name);
    }
}

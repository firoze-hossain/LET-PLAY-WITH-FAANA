package com.roze.faana.java.whileLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        //do will execute the block of code at least once, then it checks the condition after one execution
        do {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        } while (name.isBlank());
        System.out.println("Hello " + name);
    }
}

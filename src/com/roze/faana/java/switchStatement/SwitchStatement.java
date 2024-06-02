package com.roze.faana.java.switchStatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");
        String day = sc.nextLine();
        switch (day) {
            case "Saturday":
                System.out.println("Is is " + day);
                break;
            case "Sunday":
                System.out.println("Is is " + day);
                break;
            case "Monday":
                System.out.println("Is is " + day);
                break;
            case "Tuesday":
                System.out.println("Is is " + day);
                break;
            case "Wednesday":
                System.out.println("Is is " + day);
                break;
            case "Thursday":
                System.out.println("Is is " + day);
                break;
            case "Friday":
                System.out.println("Is is " + day);
                break;
            default:
                System.out.println("It is not a day!!");
        }
    }
}

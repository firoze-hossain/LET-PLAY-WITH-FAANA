package com.roze.faana.java.stringMethods;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Firoze";
        String name1 = "   Hossain   ";
        boolean equals = name.equals("Firoze");
        System.out.println(equals);
        boolean caseSensitive = name.equals("firoze");
        System.out.println(caseSensitive);
        boolean ignoreCase = name.equalsIgnoreCase("firoze");
        System.out.println(ignoreCase);
        char charValue = name.charAt(1);
        System.out.println(charValue);
        int indexNo = name.indexOf("r");
        System.out.println(indexNo);

        String toLowerCase = name.toLowerCase();
        System.out.println(toLowerCase);
        String toUpperCase = name.toUpperCase();
        System.out.println(toUpperCase);
        int length = name.length();
        System.out.println(length);
        String removeSpace = name1.trim();
        System.out.println(removeSpace);
    }
}

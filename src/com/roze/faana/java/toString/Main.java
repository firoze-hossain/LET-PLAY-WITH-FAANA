package com.roze.faana.java.toString;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.id = 1;
        book.name = "Java Advanced";
        book.title = "Java for all";
        book.title = "Firoze";
        //implicitly call toString() method
        //System.out.println(book);
        //explicitly call toString() method
        System.out.println(book.toString());
    }
}

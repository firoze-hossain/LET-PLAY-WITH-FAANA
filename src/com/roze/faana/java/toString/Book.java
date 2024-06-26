package com.roze.faana.java.toString;

public class Book {
    Integer id;
    String title;
    String name;
    String author;

    public String toString() {
        return id + ", " + title + ", " + name + ", " + author;
    }
}

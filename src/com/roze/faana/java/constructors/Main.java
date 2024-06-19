package com.roze.faana.java.constructors;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Firoze", 28, 70);
        System.out.println(human.name);
        human.eat();
        human.sleep();
    }
}

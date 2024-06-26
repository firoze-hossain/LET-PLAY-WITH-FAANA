package com.roze.faana.java.overloadedConstructors;

public class Student {
    Integer id;
    String firstName;
    String lastName;
    String email;
    String phone;

    Student() {

    }

    Student(Integer id) {
        this.id = id;
    }

    Student(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student(Integer id, String firstName, String lastName, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
}

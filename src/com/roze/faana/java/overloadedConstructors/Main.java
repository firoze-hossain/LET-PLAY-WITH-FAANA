package com.roze.faana.java.overloadedConstructors;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        System.out.println("Here are student's info: ");
//        System.out.println(student.id);
//        System.out.println(student.firstName);
//        System.out.println(student.lastName);
//        System.out.println(student.email);
//        System.out.println(student.phone);


//        Student student1 = new Student(1);
//        System.out.println("Here are student's info: ");
//        System.out.println("Id = " + student1.id);
//        System.out.println("First name = " + student1.firstName);
//        System.out.println("Last name = " + student1.lastName);
//        System.out.println("Email = " + student1.email);
//        System.out.println("Phone = " + student1.phone);

//        Student student2 = new Student(1,"Firoze","Hossain");
//        System.out.println("Here are student's info: ");
//        System.out.println("Id = " + student2.id);
//        System.out.println("First name = " + student2.firstName);
//        System.out.println("Last name = " + student2.lastName);
//        System.out.println("Email = " + student2.email);
//        System.out.println("Phone = " + student2.phone);

        Student student3 = new Student(1, "Firoze", "Hossain", "firoze@gmail.com", "01714271620");
        System.out.println("Here are student's info: ");
        System.out.println("Id = " + student3.id);
        System.out.println("First name = " + student3.firstName);
        System.out.println("Last name = " + student3.lastName);
        System.out.println("Email = " + student3.email);
        System.out.println("Phone = " + student3.phone);

    }


}

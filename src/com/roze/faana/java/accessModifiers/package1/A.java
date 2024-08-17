package com.roze.faana.java.accessModifiers.package1;

public class A {
    //protected is accessible when by using subclass(like extends,implements keyword)
    //private is accessible only within in class not in same or other package
    //public is accessible from any package or same package
    //default is accessible within same package
//    public static void main(String[] args) {
//
//    }

    protected String protectedMessage="This is protected";
}

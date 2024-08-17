package com.roze.faana.java.accessModifiers.package2;

import com.roze.faana.java.accessModifiers.package1.A;

public class ASub extends A {
    //access default message
//    public static void main(String[] args) {
//        C c=new C();
//        System.out.println(c.defaultMessage);
//    }

    //protected message
    public static void main(String... args){
        ASub aSub=new ASub();
        System.out.println(aSub.protectedMessage);
    }
}

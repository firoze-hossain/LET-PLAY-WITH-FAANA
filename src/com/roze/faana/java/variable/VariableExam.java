package com.roze.faana.java.variable;

public class VariableExam {
    public static void main(String[] args) {
        //int intVar;//This is declaration
       // intVar=123;//This is assignment
        //int holds 4 bytes
        int intVar=123;//This is initialization
        System.out.println("int="+intVar);
        //byte holds 1 byte(-128 to 127)
        byte byteVar=127;
        System.out.println("Byte="+byteVar);
        //short hold two bytes
        short shortVar=12345;
        System.out.println("short="+shortVar);
        //boolean holds only two value true or false
        //it holds 1 bit
        boolean booleanVar=true;
        System.out.println("boolean="+booleanVar);
        //it holds 8 bytes
        //but should be suffixed with with letter "L or l"
        long longVar=12358887199999553l;
        System.out.println("long="+longVar);
        //float holds 4 bytes
        //after decimal it holds 6-7 digit
        //it should be suffixed with letter "f"
        float floatVar=123.4587f;
        System.out.println("float="+floatVar);
        //double use more precision than float
        // and should be suffixed with any letter
        //it holds 8 bytes
        //after decimal points it holds 15 digits
        double doubleVar=12587444.23658888;
        System.out.println("double="+doubleVar);

        //char holds two bytes
        //it can contain single letter, ascii character, symbol
        //the value will be in single quote
        char charVar='A';
        System.out.println("char="+charVar);
        //reference variable
        //it holds undefined number of values
        //because it is user defined
        String stringVar="Hello";
        System.out.println("String="+stringVar);

    }
}

package com.roze.faana.java.printf;

public class PrintfMethod {
    public static void main(String[] args) {
        System.out.printf("Hello Java %d", 21);
        System.out.println();
        boolean myBool = true;
        String myStr = "Firoze Hossain";
        int myInt = 123;
        double myDouble = -1230.566665477774;
        // double myDouble=1230.566665477774;
        char myChar = 'F';
        System.out.printf("%b", myBool);
        System.out.println();
        System.out.printf("%s", myStr);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%f", myDouble);
        System.out.println();
        System.out.printf("%c", myChar);

        System.out.println();
        //precision
        System.out.printf("%.2f", myDouble);
        System.out.println();
        //left justify
        System.out.printf("%-20s", myStr);
        System.out.println();
        //right justify
        System.out.printf("%20s", myStr);
        System.out.println();
        //comma with greater than or equal 1000
        System.out.printf("%,f", myDouble);
        System.out.println();
        //0 padding
        System.out.printf("%020f", myDouble);
        System.out.println();
        //show + or -
        System.out.printf("%+f", myDouble);

    }
}

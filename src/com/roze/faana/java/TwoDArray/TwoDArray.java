package com.roze.faana.java.TwoDArray;

public class TwoDArray {
    public static void main(String[] args) {
//        String[][] names = new String[3][3];
//        names[0][0] = "Firoze";
//        names[0][1] = "Hossain";
//        names[0][2] = "Ahmed";
//        names[1][0] = "Millat";
//        names[1][1] = "Rayhan";
//        names[1][2] = "Shajib";
//        names[2][0] = "Mydul";
//        names[2][1] = "Imtiaze";
//        names[2][2] = "Noyon";

        String[][] names = {{"Firoze", "Hossain", "Ahmed"}, {"Millat", "Rayhan", "Shajib"}, {"Mydul", "Imtiaze", "Imtiaze"}};
        for (int i = 0; i < names.length; i++) {
            System.out.println();
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
        }

    }
}

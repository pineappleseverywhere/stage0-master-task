package com.epam.loops;


public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces for left padding
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // Print ascending numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Print descending numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println(); // Move to the next line for the next row
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
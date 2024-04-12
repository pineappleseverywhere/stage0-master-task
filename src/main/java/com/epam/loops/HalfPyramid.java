package com.epam.loops;


public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print leading spaces
            for (int space = 1; space <= cathetusLength - i; space++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

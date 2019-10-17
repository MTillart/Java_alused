package com.company2;

import java.util.Scanner;

public class Printing {
    public static void main (String [] args){
        printHalfTriangle(5);

    }
    public static void printSquare (int size) {
        int i= 0;
        while (i < size) {
            printStars(size);
            System.out.println();
            i++;
        }
    }
    public static void printRectangle (int width, int height) {
        int i= 0;
        while (i < height) {
            printStars(width);
            System.out.println();
            i++;
        }
    }
    public static void printHalfTriangle (int size) {
        int i= 0;
        while (i < size) {
            printStars(i);
            System.out.println();
            i++;
        }
    }


    public static void printStars (int amount) {
        int i= 0;
        while (i <= amount){
            System.out.print("*");
            i++;
        }

    }
}

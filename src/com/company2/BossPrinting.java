package com.company2;

public class BossPrinting {
    // printing stars and whitespaces
    public static void main (String [] args){
        xmasTree(8);


    }

    public static void printWhitespace (int size) {
        int i= 0;
//        while (size > 0){
//            System.out.print(" ");
//            size--;
//        }
        while (i < size){
            System.out.print(" ");
            i++;
        }
    }
    public static void printStars (int size) {
        int i= 0;
        while (i < size){
            System.out.print("*");
            i++;
        }

    }
    public static void xmasTree (int size) {
        int i= 1;
        int end = (size * 2) - 1;
        int wsSum = (end - 1) / 2;

        while (i<= end){
            printWhitespace(wsSum);
            printStars(i);
            System.out.println();
            wsSum-=1;
            i+=2;

        }
        int a = 0;
        int trunkWS = (end-3)/2;
        while (a < 2) {
            printWhitespace(trunkWS);
            printStars(3);
            System.out.println();
            a++;
        }

    }



}

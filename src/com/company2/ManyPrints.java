package com.company2;

import java.util.Scanner;

public class ManyPrints {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Hey, type a number:");
        int result = Integer.parseInt(reader.nextLine());
        int i= 0;
        while (i<= result){
            printText();
            i++;
        }

    }
    public static void printText(){
        System.out.println("I am very repetitive line");
    }

}

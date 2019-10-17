package com.company2;

import java.util.Scanner;

public class SumOfSetNumbers {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("Until what number? : ");
        int end = Integer.parseInt(reader.nextLine());
        int i =0;

        while (i <= end) {
            sum += i;
            i++;

        }

        System.out.println("Sum in the end: " + sum);
    }
}

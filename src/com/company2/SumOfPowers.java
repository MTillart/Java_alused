package com.company2;

import java.util.Scanner;

public class SumOfPowers {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("Type a number: ");
        double end = Integer.parseInt(reader.nextLine());
        double i = 0;


            while (i <= end) {
                int result = (int)Math.pow (2, i);
                i++;
                sum += result;

            }

        System.out.println("Sum in the end: " + sum);



    }
}

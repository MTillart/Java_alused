package com.company2;

import java.util.Scanner;

public class Factorial {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        int sum = 1;
        System.out.println("Until what number? : ");
        int end = Integer.parseInt(reader.nextLine());
        int i =1;

        if (end == 0) {
//            sum = 1;3

            System.out.println("0! = "+ sum);
        } else {
            while (i <= end) {
                sum *= i;
                i++;

            }
        }
        System.out.println("Sum in the end: " + sum);



    }
}

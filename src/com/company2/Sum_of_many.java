package com.company2;

import java.util.Scanner;

public class Sum_of_many {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("Start adding numbers (Quit with adding 0). Your first number: ");
        while (true) {

            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }else {
                sum += read;
            }




            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
    }
}

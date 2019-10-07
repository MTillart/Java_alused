package com.company;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());


        if ((number % 2) == 0)
        {
            System.out.println(number + " is even");
        }
        else
        {
            System.out.println(number + " is odd");
        }

    }
}

package com.company2;

import java.util.Scanner;

public class LowerUpper {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Hey, type a number:");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("Hey, type a another number:");
        int second = Integer.parseInt(reader.nextLine());

        System.out.println("Here we have all the number between these two:");
        if(first < second){
            while (first < second){
                first++;
                if (first== second ){
                    break;
                }
                System.out.println(first+1);
            }
        }else {
                while (second > first){
                    System.out.println(second);
                    second--;
                }
            }




    }
}

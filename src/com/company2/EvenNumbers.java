package com.company2;

public class EvenNumbers {
    public static void main (String [] args){

        int number = 1;
        while (number < 50) {
            if (number % 2 == 0)   {
                System.out.println(number);
                number++;
            } else{
                number++;
                continue;
            }

        }
    }
}

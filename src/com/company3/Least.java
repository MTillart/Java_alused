package com.company3;

public class Least {

    public static void main(String[] args) {
        int answer =  least(9, 7);
        System.out.println("Least: " + answer);
    }
    public static int least(int number1, int number2) {
        // return smallest number
        if (number1 >  number2) {
            return number2;
        }else {
            return number1;
        }
    }


}

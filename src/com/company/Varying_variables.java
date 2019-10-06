package com.company;

public class Varying_variables {
    public static void main (String[] args) {
        int number = 3;
        double decimal = 5.5;
        String string = "There is none";
        // Changes
        number = 9000;
        decimal = 0.1;
        string = "Zetor";


        System.out.println("Chickens:");
        System.out.println(number);
        System.out.println("Bacon (kg):");
        System.out.println(decimal);
        System.out.println("A tracktor");
        System.out.println(string);

        System.out.println("In a nutshell:");
        System.out.println(number);
        System.out.println(decimal);
        System.out.println(string);

        int seconds = 365 * 24 * 60 * 60;
        System.out.println("There is "+ seconds + " seconds in a year.");

    }
}

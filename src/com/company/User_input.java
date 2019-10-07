package com.company;
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class User_input {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        // code here
        System.out.println("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("Type a number: ");
        int second = Integer.parseInt(reader.nextLine());

        double sum = (double)first / second;

        System.out.println(first+ " divaided by " + second + " equals " + sum );

        System.out.println("Type a radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        double round = 2 * Math.PI * radius;

        System.out.println("Circumference of the circle: " + round );


    }
}

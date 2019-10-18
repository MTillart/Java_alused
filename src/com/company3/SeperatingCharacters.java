package com.company3;

import java.util.Scanner;

public class SeperatingCharacters {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hei, type here your name: ");
        String name = reader.nextLine();
        System.out.println("name lenght: "+ name.length());
        // reversing the name
        int i = name.length()-1;



        if (name.length() <= 2) {
            System.out.println("Uuf such a short name.");

        } else {
            System.out.println("1. character: "+ name.charAt(0));
            System.out.println("2. character: "+ name.charAt(1));
            System.out.println("3. character: "+ name.charAt(2));
            System.out.println("In reverse order: ");
            while (i >= 0){
                System.out.print(name.charAt(i));
                i--;
            }
        }

    }
}

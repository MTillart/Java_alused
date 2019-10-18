package com.company3;

import java.util.Scanner;

public class WordInAWord {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a  first word: ");
        String first = reader.nextLine();
        System.out.println("How about a another word:");
        String second = reader.nextLine();

        int secLeng = second.length();

        int index = first.indexOf(second);
        System.out.println(index);

        if (index == -1 ) {
            System.out.println("The word '" + second + "' is not found in the word '" + first + "'.");
        }else {
            System.out.println("The word '" + second + "' is found in the word '" + first + "'.");
        }



    }
}

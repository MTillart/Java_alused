package com.company3;

import java.util.Scanner;

public class Palindrome {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        //System.out.println(reverse(text));
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
    public static boolean palindrome(String text){

        if (text.contains(reverse(text))){
            return true;
        }
    return false;
    }
    public static String reverse(String text) {
        String help = "";
        int i = text.length()-1;
        while (i >= 0){
            help +=text.charAt(i);
            //System.out.print(text.charAt(i));
            i--;
        }
        return help;

    }


}

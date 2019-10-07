package com.company;

import java.util.Scanner;

public class Usernames {
    public static void main(String[] args) {
        String userAlex = "alex";
        String userEmily = "emily";

        String passAlex = "mightyducks";
        String passEmily = "cat";



        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username:");
        String userName = reader.nextLine();
        System.out.println("Type your password:");
        String passWord = reader.nextLine();

        if ((userName.equals(userAlex) && passWord.equals(passAlex))||
                (userName.equals(userEmily) && passWord.equals(passEmily))
        ){
            System.out.println("You are logged into the system");
        }else{
            System.out.println("Nope! Something's fishy.");
        }



    }
}

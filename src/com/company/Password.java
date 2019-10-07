package com.company;

import java.util.Scanner;

public class Password {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        String password = "dandy";

        while (true){
            System.out.println("Write the unknown password to reveal a secret:");
            String passWord = reader.nextLine();

            if (password.equals(passWord)){
                System.out.println("Well done! The secret is: World is as strange as you want it to be");
                break;
            }else{
                System.out.println("Nope!");
            }

        }





    }
}

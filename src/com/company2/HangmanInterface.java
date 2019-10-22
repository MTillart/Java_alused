package com.company2;

import hangman.Hangman;

import java.util.Scanner;

public class HangmanInterface {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printMenu();
        System.out.println("What do you want to do next?");

        while (hangman.gameOn()) {
            String command = reader.nextLine();
            if (command.contains("quit")) {

                break;
            } else if (command.contains("status")) {
                System.out.println("Game status:");
                hangman.printStatus();

            } else if (command.length() == 1) {
                hangman.guess(command);
                hangman.printMan();
                hangman.printWord();

            } else if (command.isEmpty()){
                printMenu();
            }
        }

        System.out.println("Thank you for playing!");
    }

    private static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }

}

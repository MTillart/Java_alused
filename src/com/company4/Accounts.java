package com.company4;


public class Accounts {
    public static void main (String [] args) {
        Account mattAccount = new Account("Matt's account",1000.00);
        Account myAccount = new Account("My account",0.00);

        System.out.println("Initial state");
        System.out.println(mattAccount);
        System.out.println(myAccount);

        mattAccount.withdrawal(100);
        System.out.println("Matt's account balance is now: " + mattAccount.balance());
        myAccount.deposit(100);
        System.out.println("My account balance is now: "+myAccount.balance());

        System.out.println("Final state");
        System.out.println(mattAccount);
        System.out.println(myAccount);
    }
}

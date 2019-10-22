package com.company4;


public class Accounts {
    public static void main (String [] args) {
        Account aAccount = new Account("A account",100.00);
        Account bAccount = new Account("B account",0.00);
        Account cAccount = new Account("C account",0.00);

        System.out.println("Initial state");
        System.out.println(aAccount);
        System.out.println(bAccount);
        System.out.println(cAccount);

        transfer(aAccount, bAccount, 50);
        transfer(bAccount, cAccount, 25);
        System.out.println("A account balance is now: " + aAccount.balance());
        System.out.println("B account balance is now: "+ bAccount.balance());
        System.out.println("C account balance is now: "+ cAccount.balance());

    }
    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}

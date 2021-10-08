package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {
        Account abhiAccount = new Account("Abhi");
        abhiAccount.deposit(1000);
        abhiAccount.withdraw(500);
        abhiAccount.withdraw(-200);
        abhiAccount.withdraw(-20);
        abhiAccount.calculateBalance();
//        abhiAccount.balance = 5000;

        System.out.println("Balance on account is " + abhiAccount.getBalance());
    }
}

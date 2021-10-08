package com.abhinaygarg;

import java.util.ArrayList;

public class Account {
//    private String accountName;
//    private int balance = 0;
//    private ArrayList<Integer> transactions;
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount){
        int withdrawl = -amount;
        if(withdrawl < 0){
            this.transactions.add(withdrawl);
            this.balance += amount;
            System.out.println(amount + " withdrawl. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot widhdraw negative sums.");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for(int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance " + this.balance);
    }
}

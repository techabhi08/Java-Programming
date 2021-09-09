package com.abhinaygarg;

public class Account {
    private String  number;
    private double balance;
    private String customerName;
    private String email;
    private String  phoneNumber;


    public Account() {
        this("56789", 1000.0, "DefaultName", "DefaultAddress", "DefaultNumber");
        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance, String customerName, String email,
                   String phoneNumber){
        System.out.println("Account Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("99999", 100000.0, customerName, email, phoneNumber);

    }
    public String  getAccountNumber(){
        return number;
    }
    public void setAccountNumber(String number){
        this.number = number;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. Current Balance: " + this.balance);
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount > this.balance){
            System.out.println("Insufficient Balance. Only " + this.balance + " left. Withdrawal not processed");
        }else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Amount left: " + this.balance);
        }
    }
}

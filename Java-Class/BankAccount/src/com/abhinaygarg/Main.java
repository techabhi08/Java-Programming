package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {
//	Account abhiAccount = new Account("12345", 0, "Abhi", "abh", "12345");
//
//	System.out.println(abhiAccount.getAccountNumber());
//	System.out.println(abhiAccount.getPhoneNumber());
//	System.out.println(abhiAccount.getCustomerName());
//	abhiAccount.withdraw(10000.0);
//	abhiAccount.deposit(1000);
//	abhiAccount.withdraw(500);
//	abhiAccount.deposit(3000);
//	abhiAccount.deposit(6500);
//	abhiAccount.withdraw(1200);


		VipCustomer abhi = new VipCustomer();
        System.out.println(abhi.getCreditLimit());
        VipCustomer tim = new VipCustomer("Tim", 25000);
        System.out.println(tim.getName());
        VipCustomer ron = new VipCustomer("ron", 25000, "b@c");
        System.out.println(ron.getName());

    }
}

package com.abhinaygarg;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Maharaja Mac", "Aalo Tikki & cheese", 200, "Double Bread");
        super.addHamburgerAddition1("Chips", 10);
        super.addHamburgerAddition2("Coke", 20);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Sorry! This is a deluxe Burger, No addons available");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Sorry! This is a deluxe Burger, No addons available");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Sorry! This is a deluxe Burger, No addons available");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Sorry! This is a deluxe Burger, No addons available");
    }
}

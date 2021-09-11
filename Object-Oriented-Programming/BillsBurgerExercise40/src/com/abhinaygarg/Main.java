package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {

        Hamburger ham = new Hamburger("Basic", "Aalo Tikki", 40, "White");
        ham.addHamburgerAddition1("Cheese", 30);
        ham.addHamburgerAddition2("Tikki", 50);
        ham.itemizHamburger();

        DeluxeBurger db = new DeluxeBurger();
        db.itemizHamburger();

        HealthyBurger healthy = new HealthyBurger("Oats Tikki", 300);
        healthy.addHealthyAddition1("Veggies", 30);
        healthy.addHealthyAddition2("Eggs", 10);
        healthy.itemizHamburger();

    }
}

package com.abhinaygarg;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    public HealthyBurger(String meat, double price) {
        super("Low Fat", meat, price, "WholeWheat");
    }
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizHamburger() {
        System.out.println("A Low Fat Burger Whole wheat bread and addons " + healthyExtra1Name + " "
        + healthyExtra2Name);
        return healthyExtra1Price + healthyExtra2Price +super.itemizHamburger();
    }
}

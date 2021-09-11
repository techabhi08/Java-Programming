package com.abhinaygarg;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("    Added: " + addition1Name + " || " +
                " Extra amount: Rs. " + addition1Price);
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("    Added: " + addition2Name + " || " +
                " Extra amount: Rs. " + addition2Price);
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("    Added: " + addition3Name + " || " +
                " Extra amount: Rs. " + addition3Price);
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("    Added: " + addition4Name + " || " +
                           " Extra amount: Rs. " + addition4Price);
    }
    public double itemizHamburger(){
        System.out.println("\n" +"                 ||    TOTAL BILL AMOUNT   ||                ");
        System.out.println("\n" + "Burger: " + name + "\n" + "Bread Type: " + breadRollType +"\n"+ "Tikki: " + meat
                +"\n" + "Price Rs." + price +
                "\n" + "Addons added: " + addition1Name + " "+ addition2Name +" "+ addition3Name +" "+ addition4Name
                +"\n*****************************************************" + "\n");
        return(this.price + addition1Price + addition2Price +
                addition3Price + addition4Price);
    }
}

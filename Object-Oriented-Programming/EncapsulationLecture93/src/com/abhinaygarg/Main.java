package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Abhi";
//        player.health = 200;
//        player.weapon = "Sword";
//
//        int damage = 100;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 300;
//        player.health = 250;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Abhi", 50, "Hammer");
//        System.out.println("Initial health is: " + player.getHealth());

        Printer printer = new Printer(50, true);
        System.out.println("Initial count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed: " + pagesPrinted + " new total print count " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(8);
        System.out.println("pages printed: " + pagesPrinted + " new total print count " + printer.getPagesPrinted());

    }
}

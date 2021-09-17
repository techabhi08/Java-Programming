package com.abhinaygarg;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//        Gearbox mcLaren = new Gearbox(6);
//        Gearbox first = mcLaren.new Gear(1, 12.3); if the inner class would have been public we can use it this way.
        // Instanciating objectss for the inner class in the below given 3 ways would not work.
        // We need to use the instance of the outer class.
//        Gearbox.Gear second = new Gearbox.Gear(1, 12.3);
//        Gearbox.Gear second = new mcLaren.Gear(1, 12.3);
//        Gearbox.Gear second = new Gear(1, 12.3);
//        Gearbox.Gear second = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));

      
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();;
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

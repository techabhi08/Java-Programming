package com.abhinaygarg;

import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player abhi = new Player("Abhi", 10, 15);
        System.out.println(abhi.toString());
        saveObject(abhi);

        abhi.setHitPoints(8);
        System.out.println(abhi);
        abhi.setWeapon("Strombringer");
        saveObject(abhi);
        loadObject(abhi);
        System.out.println(abhi);

        ISaveable thanos = new Monster("Thanos", 20, 40);
        System.out.println("Strength = " +((Monster) thanos).getStrength());
        System.out.println(thanos);
        saveObject(thanos);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage drive");
        }
    }

    private static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}


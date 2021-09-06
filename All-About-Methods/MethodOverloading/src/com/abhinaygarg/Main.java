package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("abhi", 1000);
//        System.out.println(newScore);
//        int newscore = calculateScore(500);
//        System.out.println(newscore);
//    }
//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score);
//        return score * 1000;
//    }
//    public static int calculateScore( int score) {
//        System.out.println("Player scored " + score);
//        return score * 1000;
        double centimeters = calcFeetAndInchesToCentimeters(7, 5);
        if(centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }else{
            double centimeters = (feet * 12 * 2.54);
            centimeters += (inches * 2.54);
            System.out.println(feet + " feet, " + inches + " incehs = " + centimeters + " cm");
            return (centimeters);

        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if(inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to feet " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);


    }


}

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        boolean isAlien = false;
//        if (isAlien == false) {
//            System.out.println("It is not an alien");
//            System.out.println("I am scared of them");
//        }
//
//        int topScore = 80;
//        if (topScore < 100) {
//            System.out.println("You got the high score!");
//        }
//
//        int secondTopScore = 60;
//        if(topScore > secondTopScore && secondTopScore < 100) {
//            System.out.println("Second highest score and less than 100");
//        }
//        boolean isCar = false;
//        if (isCar) {
//            System.out.println("This is car");
//        }
//
//        boolean wasCar = isCar ? true : false;


        //Operator challenge

        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double result = (myFirstValue + mySecondValue) * 100;

        double myRemainder = result % 40;
        boolean isZero = myRemainder == 0;
        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }


    }
}

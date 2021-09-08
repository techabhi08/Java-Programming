package com.abhinaygarg;
//
//MIN AND MAX CHALLENGE LECTURE 75

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int maxNum = Integer.MIN_VALUE;
//        int minNum = Integer.MAX_VALUE;
//        // boolean first = true;            (this is alternate solution)
//        while(true) {
//            System.out.println("Enter Number: ");
//
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt) {
//                int number = scanner.nextInt();
//
////Here we are using the flag method. On line 13 the first number was set to true. There the number One was not having ans value.
////It was accepting the value so on line 24 we checked if first is true then set it to false and set min and max number to the number
////that user entered. Now next time user won't be able to execute through this statement as if(first) is now false. Hence the min and max values are fixed now.
////                if(first) {
////                    first = false;
////                    minNum = number;
////                    maxNum = number;
////                }
////The second time user will directly come to line 31 and check the number as compared to the first number that user entered when first was true.
//
//                if(number < minNum){
//                    minNum = number;
//                }
//                if(number > maxNum){
//                    maxNum = number;
//                }
//            } else {
//                System.out.println("Invalid Number");
//                break;
//            }
//            scanner.nextLine();
//        }
//        System.out.println("Maximum number: " + maxNum);
//        System.out.println("Minimum Number: " + minNum);
//        scanner.close();
//    }
//}


//Sum and average Challenge Exercise 27- InputCalculator
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                count += 1;
            }else{
                break;
            }
            average =  Math.round((double) sum / count);

            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}

package com.abhinaygarg;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//    //TYPE 1
//        int [] myIntArray = new int[10];
//        myIntArray [4] = 10; ///initializing the value of particular index
//                             // for type 1
//
//    //TYPE 2
//        int [] mySecondArray = {1,2,3,4,5,6,7,8,9,10};
//
//    //TYPE 3 using for loop
//        int[] myThirdArrayType = new int[10];
//        for (int i = 0; i < 10; i++){
//            myThirdArrayType[i] = i+1;
//            System.out.println("Element" + i + ", value" + myThirdArrayType[i]);
//        }
//
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
//        System.out.println(mySecondArray[5]);
//        System.out.println(myThirdArrayType[5]);
//        System.out.println(myDoubleArray[5]);
//        printArrays(myIntArray);
//    }
//    public static void printArrays(int[] arrays){
//        for(int i = 0; i<arrays.length; i++){
//            arrays[i] = i+1;
//            System.out.println("Element: " + i + ", value: " + arrays[i]);
//        }
//    }
        int[] myInteger = getIntegers(5);
        for(int i = 0; i<myInteger.length; i++){
            System.out.println("Element: "  + i + "value: " + myInteger[i]);
        }
        System.out.println("The average is " + getAverage(myInteger));
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values \r");
        int[] values = new int[number];
        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double) array.length;
    }

}

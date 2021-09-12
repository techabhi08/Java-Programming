package com.abhinaygarg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Program to sort the array in the descending order
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = getIntegers(count);
        int[] returnedSorted = sortIntegers(returnedArray);
        printArray(returnedSorted);

    }
    public static int[] getIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " integers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element: " + i + " Value is: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length -1; i++){
//            for(int j = i + 1; j < array.length; j++){
//                if(array[i] < array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        for (int k = 0; k < array.length; k++){
//            sortedArray[k] = array[k];
//        }
//        return sortedArray;


        //===============OR=======================


//        int[] sortedArray = new int[array.length];
//        for (int k = 0; k < array.length; k++){
//            sortedArray[k] = array[k];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                    if (sortedArray[i] < sortedArray[i + 1]) {
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i+1];
                        sortedArray[i+1] = temp;
                        flag = true;
                    }
            }
        }

        return sortedArray;
    }



    //Minimun element in array challenge
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        System.out.println("Enter the count: ");
//        int count = scanner.nextInt();
//        scanner.nextLine();
//
//        int[] returnedArray = getIntegers(count);
//        int returnedMin = findMin(returnedArray);
//        System.out.println("Min = " + returnedMin);
//    }
//
//    public static int[] getIntegers(int number){
//        int[] array = new int[number];
//        System.out.println("Enter " + number + " integers: ");
//        for(int i = 0; i < array.length; i++){
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//    public static int findMin(int[] array){
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i < array.length; i++){
//            if(array[i] < min)
//                min = array[i];
//        }
//        return min;
//    }
}

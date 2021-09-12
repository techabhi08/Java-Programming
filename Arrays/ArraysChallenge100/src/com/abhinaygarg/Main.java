package com.abhinaygarg;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        sortIntegers(myIntegers);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter " + number + " integer values: ");
        for (int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i = 0; i< array.length; i++){
            for(int j=i+1; j < array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return sortedArray;
    }
}

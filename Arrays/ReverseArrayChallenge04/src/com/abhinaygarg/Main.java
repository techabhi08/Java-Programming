package com.abhinaygarg;

import java.util.Arrays;

//public class Main {
//
//    public static void main(String[] args) {
//        int[] nonReversed = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(nonReversed));
//        reverse(nonReversed);
//        System.out.println(Arrays.toString(nonReversed));
//    }
//    private static void reverse(int[] array){
//        for(int i = 0; i<array.length; i++){
//            for(int j = i+1; j < array.length; j++){
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//
//    }
//}

// OR we can use this method MORE APPROPRIATE

public class Main {

    public static void main(String[] args) {
        int[] nonReversed = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nonReversed));
        reverse(nonReversed);
        System.out.println(Arrays.toString(nonReversed));
    }
    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++){
                int temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex - i] = temp;

        }

    }
}

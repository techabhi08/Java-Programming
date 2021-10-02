package com.example.test;

import com.abhinaygarg.mylibrary.Series;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println("Sum of first " + i + " number is: " + Series.nSum(i));
        }

        System.out.println("==========================");
        for (int i = 0; i<=10; i++){
            System.out.println(Series.factorial(i));
        }

        System.out.println("==========================");
        for (int i = 0; i<=10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}

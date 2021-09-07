package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
    public static int sumDigits (int number){
        if(number >= 10){
            int sum = 0;
            int reminder;
            while(true){
                reminder = number % 10;
                sum += reminder;
                number = number / 10;
                if( number == 0) {
                    break;
                }
            }
            return sum;
        }
        return -1;
    }


}

// or we can write like this also
//int sum = 0;
//    int reminder;
//            while(number > 0){
//                    reminder = number % 10;
//                    number = number / 10;
//                    sum += reminder;
//             }


//    public static int getEvenDigitSum(int number){
//        if (number < 0) return -1;
//        int sum = 0;
//        int rem;
//        while (number > 0){
//            rem = number % 10;
//            if (rem % 2 == 0){
//                sum += rem;
//            }
//            number /= 10;
//        }
//        return sum;
//    }

package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {

//        int count = 7;
//        do {
//            System.out.println(count);
//            count++;
//        } while(count < 6);
//
//        count = 6;
//        do {
//            System.out.println(count);
//            count++;
//            if(count > 15) {
//                break;
//            }
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            System.out.println(number);
            count++;
            if(count >= 5){
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return(number % 2 == 0);
    }
}

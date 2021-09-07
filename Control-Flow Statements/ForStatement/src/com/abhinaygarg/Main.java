package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {

//****************Calculating the interest of given range of interest percentage and amount **********************//

//        for (int i = 2; i < 9; i++){
//            System.out.println("The interest of " + i + "% at amount of 10000: " + calculateInterest(10000.0, i));
//        }

//************************************** Taking out 3 prime numbers from given range *****************************//
//        int count = 0;
//        for (int i = 10; i < 20; i++){
//            if(isPrime(i)){
//                count++;
//                System.out.println(i + " is a prime number");
//                if(count == 3) {
//                    break;
//                }
//            }
//        }

//******************************************** 3 and 5 number Challenge ******************************************//
        int sum = 0;
        int count = 0;
        for(int i = 1; i < 1000; i++) {
            if (i % 15 == 0) {
                sum += i;
                count += 1;
                System.out.println(i);
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("Sum is: " + sum);

//***************************************** End of Challenge ****************************************************//

    }


//***************** Calling Calculating the interest of given range of interest percentage and amount ***********//

//    public static double calculateInterest (double amount, double interestRate) {
//        return (amount * (interestRate / 100));
//    }


// ****************************** Taking out 3 prime numbers from given range ***********************************//

//    public static boolean isPrime(int n) {
//        if (n == 1){
//            return false;
//        }
//        for(int i = 2; i < n; i ++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}

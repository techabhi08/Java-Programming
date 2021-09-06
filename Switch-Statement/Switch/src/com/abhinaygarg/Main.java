package com.abhinaygarg;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("was a 3, 4 or a 5");
                System.out.println("Actually was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
        }

        char charValue = 'A';
        switch(charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':case 'D': case 'E':
                System.out.println("Actually was a " + charValue);
                break;
            default:
                System.out.println("Was not A, B, C, D or E");
        }

        String month = "JanUaRY";
        System.out.println(month.toLowerCase());
    }
}

package com.abhinaygarg;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Abhi");

        //This is one method defining a user defined class and using it this way
        ArrayList<IntClass> intArrayList = new ArrayList<>();
        intArrayList.add(new IntClass(10));

        //This is the method how we use autoboxing and unboxing using wrapper class
        ArrayList<Integer> intArryList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            intArryList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArryList.get(i).intValue());
        }

        Integer myValue = 56; //Integer.valueOf(56);
    }
}

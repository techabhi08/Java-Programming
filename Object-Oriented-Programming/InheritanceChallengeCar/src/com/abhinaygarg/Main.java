package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Audi audi = new Audi(36);
        audi.accelerate(40);
        audi.changeSpeed(100, 45);
        audi.accelerate(-40);
        audi.changeSpeed(75, 30);
        audi.accelerate(5);
        audi.accelerate(-80);
    }
}

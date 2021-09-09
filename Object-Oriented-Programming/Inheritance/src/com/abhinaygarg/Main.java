package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);
	    Dog dog = new Dog("Tommy", 8,30, 2, 4, 1, 20, "long silky");
	    dog.eat();
	    dog.walk();
	    dog.run();

    }
}

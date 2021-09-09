package com.abhinaygarg;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeSpeed(int speed, int direction){
        System.out.println("Car.changeSpeed(): Changed speed to " + speed + " direction: " + direction);
        move(speed, direction);
    }



}

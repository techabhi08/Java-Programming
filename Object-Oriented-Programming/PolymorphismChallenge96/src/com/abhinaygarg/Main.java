package com.abhinaygarg;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }
    public String accelerate() {
        return "Car -> accelerate()";
    }
    public String brake() {
        return "Car -> brake()";
    }
}

class Audi extends Car{
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    public String startEngine(){
        return "Engine of Audi Running";
    }
    public String brake(){
        return "Audi Brakes applied";
    }
}

class Mercedeus extends Car{
    public Mercedeus(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine(){
        return "Mercedeus Engine started";
    }
    @Override
    public String accelerate(){
        return "Mercedeus is accelerating";
    }
}
public class Main {

    public static void main(String[] args) {
            Audi audi = new Audi("Audi", 4);
            System.out.println("Car: " + audi.getName() +
                    "\n" + "Cylinders: " + audi.getCylinders() + "\n" + "Engine: " + audi.startEngine() + "\n" +
                    "Brakes: " + audi.brake() + "\n" + "Accelerate: " + audi.accelerate() + "\n");
            Mercedeus mercedeus = new Mercedeus("Mercedeus", 6);
            System.out.println("Car: " + mercedeus.getName() +
                    "\n" + "Cylinders: " + mercedeus.getCylinders() + "\n" + "Engine: " + mercedeus.startEngine() + "\n" +
                    "Brakes: " + mercedeus.brake() + "\n" + "Accelerate: " + mercedeus.accelerate());
    }
}

package com.abhinaygarg;

public class Audi extends Car{

    private int roadServiceMonths;
    public Audi(int roadServiceMonths) {
        super("Audi", 4, 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 40){
            changeGear(3);
        }else if(newVelocity > 40 && newVelocity <= 70){
            changeGear(4);
        }else{
            changeGear(5);
        }
        if(newVelocity > 0){
            changeSpeed(newVelocity, getCurrentDirection());
        }
    }
}

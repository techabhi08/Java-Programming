package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {
        ITelephone abhisPhone;
        abhisPhone = new DeskPhone(123456);
        abhisPhone.powerOn();
        abhisPhone.callPhone(123456);
        abhisPhone.answer();

        abhisPhone = new MobilePhone(24565);
        abhisPhone.powerOn();
        abhisPhone.callPhone(24565);
        abhisPhone.answer();
    }
}

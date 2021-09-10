package com.abhinaygarg;

import com.Ceiling;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 2, 3, 1, 2);
        Lamp lamp = new Lamp("Classic", true, 4);

        Room room = new Room("Abhi's room",wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        room.makeBed();
        room.getLamp();
    }
}


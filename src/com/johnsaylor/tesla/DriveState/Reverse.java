package com.johnsaylor.tesla.DriveState;

public class Reverse implements State {

    @Override
    public void accelerate() {
        System.out.println("Car goes backward");
    }

    @Override
    public void openDoor() {
        System.out.println("Door won't open. Car in Reverse!");
    }
}

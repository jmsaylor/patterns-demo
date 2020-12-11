package com.johnsaylor.teksla.DriveState;

public class Park implements State {

    @Override
    public void accelerate() {
        System.out.println("Engine revs. But, car goes nowhere.");
    }

    @Override
    public void openDoor() {
        System.out.println("Door opens");
    }
}

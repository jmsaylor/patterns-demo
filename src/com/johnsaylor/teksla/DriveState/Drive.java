package com.johnsaylor.teksla.DriveState;

public class Drive implements State {
    @Override
    public void accelerate() {
        System.out.println("Goes forward.");
    }

    @Override
    public void openDoor() {
        System.out.println("Door refuses to open. In Drive!");
    }
}

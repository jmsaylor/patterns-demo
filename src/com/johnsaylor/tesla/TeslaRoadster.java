package com.johnsaylor.tesla;

import com.johnsaylor.tesla.DriveState.Drive;
import com.johnsaylor.tesla.DriveState.Park;
import com.johnsaylor.tesla.DriveState.Reverse;
import com.johnsaylor.tesla.DriveState.State;

public class TeslaRoadster {

    State drive = new Drive();
    State park = new Park();
    State reverse = new Reverse();

    State state = park;

    public TeslaRoadster() {}

    public void pressPedal(){
        state.accelerate();
    }

    public void openDoor() {
        state.openDoor();
    }

    public void shiftToReverse(){
        System.out.println("R");
        this.state = reverse;
    }

    public void shiftToDrive() {
        System.out.println("D");
        this.state = drive;
    }

    public void shiftToPark() {
        System.out.println("P");
        this.state = park;
    }

    public static void test() {
        var teksla = new TeslaRoadster();
        teksla.pressPedal();
        teksla.openDoor();
        teksla.shiftToDrive();
        teksla.pressPedal();
        teksla.openDoor();
        teksla.shiftToReverse();
        teksla.pressPedal();
        teksla.openDoor();
        teksla.shiftToPark();
    }
}

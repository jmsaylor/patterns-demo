package com.johnsaylor.teksla;

import com.johnsaylor.teksla.DriveState.Drive;
import com.johnsaylor.teksla.DriveState.Park;
import com.johnsaylor.teksla.DriveState.Reverse;
import com.johnsaylor.teksla.DriveState.State;

public class TekslaRoadster {

    State drive = new Drive();
    State park = new Park();
    State reverse = new Reverse();

    State state = park;

    public TekslaRoadster() {}

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
        var teksla = new TekslaRoadster();
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

package com.chethan.policestation;

import com.chethan.policestation.police.Police;
import com.chethan.policestation.station.PoliceStation;

public class PoliceRunner {
    public static void main(String[] args) {
        Police police1 = new Police(1001,"Chethan","SI");
        Police police2 = new Police(1002,"Darshan","CI");
        Police police3 = new Police(1003,"Satish","ASP");
        Police police4 = new Police(1004,"Rathan","SP");
        Police police5 = new Police(1005,"Ram","Constable");
        Police police6 = new Police(1006,"aravind","ASI");
        Police police7 = new Police(1007,"Manoj","ASP");
        Police police8 = new Police(1008,"Adarsh","ASI");

        PoliceStation policeStation = new PoliceStation();
        policeStation.addpolice(police1);
        policeStation.addpolice(police2);
        policeStation.addpolice(police3);
        policeStation.addpolice(police4);
        policeStation.addpolice(police5);
        policeStation.addpolice(police6);
        policeStation.addpolice(police7);
        policeStation.addpolice(police8);

        policeStation.getAllPolice();

    }
}

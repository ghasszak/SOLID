package com.directi.training.isp.submission;

import com.directi.training.isp.submission.sensing.SensingDoor;
import com.directi.training.isp.submission.sensing.Sensor;
import com.directi.training.isp.submission.timed.TimedDoor;
import com.directi.training.isp.submission.timed.Timer;

public class MainClass {
    public static void main(String[] args) {
        // sensing
        Sensor sensor = new Sensor();
        SensingDoor sensingDoor = new SensingDoor(sensor);
        sensingDoor.proximityCallback();

        // timed
        Timer timer = new Timer();
        TimedDoor timedDoor = new TimedDoor(timer);
        timedDoor.timeOutCallback();
    }
}

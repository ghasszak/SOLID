package com.directi.training.isp.submission.sensing;

import com.directi.training.isp.submission.Door;

public class SensingDoor extends Door implements SensingObject
{
    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    @Override
    public void proximityCallback()
    {
        this.setOpened(true);
    }
}

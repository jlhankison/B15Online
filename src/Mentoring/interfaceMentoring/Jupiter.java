package Mentoring.interfaceMentoring;

import daily_classes.day052.Location;
import daily_classes.day052.Test;
import daily_classes.day052.Time;
import daily_classes.day45.Planet;

public class Jupiter extends Planet implements Location, Time {

    int time;

    @Override
    public String objectCoordinates() {
        return null;
    }

    @Override
    public double CreationTimeStamp() {
        return 0;
    }

    @Override
    public void timeToRotate() {
        time = HOURS_IN_DAY;
    }
}

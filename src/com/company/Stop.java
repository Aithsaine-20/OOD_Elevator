package com.company;

public class Stop implements StateElevator {


    @Override
    public int distance(Elevator elevator, int levelGiving, int numberOfFloors) {
        return Integer.MAX_VALUE;
    }
}

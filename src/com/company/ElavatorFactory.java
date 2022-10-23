package com.company;

public class ElavatorFactory {

    public Elevator createElevator(int level){
        return new Elevator(level);
    }
}

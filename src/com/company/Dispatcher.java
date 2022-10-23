package com.company;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {
    HashMap<String,Elevator> elevators=new HashMap<>();
    public String requestElevator(HashMap<String,Elevator> elevators,int givingLevel,int numberOfFloors ){
        this.elevators=elevators;
        int min = Integer.MAX_VALUE;
        String el=null;
        for(Map.Entry<String,Elevator> elevator : elevators.entrySet())
        {
            int a = elevator.getValue().distance(givingLevel,numberOfFloors);
            if (a <min )
            {

                min = a;
                el=elevator.getKey();
            }
        }
        //String.valueOf(min)
        return el;

    }
}

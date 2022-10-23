package com.company;

public class Down implements StateElevator{


    @Override
    public int distance(Elevator elevator, int levelGiving,int nbOfFloor) {
        if (elevator.getLevel() > levelGiving) {return elevator.getLevel()-levelGiving; }
        else {return elevator.getLevel()+2*nbOfFloor-levelGiving; }
    }

}






    /*
    public int moveUp(Elevator elevator, int levelGiving) {
        return elevator.getLevel()+levelGiving;
    }

    @Override
    public int moveDown(Elevator elevator, int levelGiving) {
        if (elevator.getLevel() > levelGiving) {return elevator.getLevel()-levelGiving; }
        else {return elevator.getLevel()+2*nbOfFloor-levelGiving; }
    }*/
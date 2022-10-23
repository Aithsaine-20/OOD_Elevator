package com.company;

public class Up implements StateElevator {
    @Override
    public int distance(Elevator elevator, int levelGiving,int nbOfFloor) {
        if (elevator.getLevel() < levelGiving) {return levelGiving-elevator.getLevel(); }
        else {return nbOfFloor-elevator.getLevel()+nbOfFloor+levelGiving; }

    }
}
// if (elevator.getLevel() < levelGiving) {return levelGiving-elevator.getLevel(); }
// else {return nbOfFloor-elevator.getLevel()+nbOfFloor+levelGiving; }
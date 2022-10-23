package com.company;

import javax.swing.table.TableStringConverter;

public class Rest implements StateElevator{
    /*@Override
    public int moveUp(Elevator elevator, int levelGiving) {
        return Math.abs(elevator.getLevel()-levelGiving);
    }

    @Override
    public int moveDown(Elevator elevator, int levelGiving) {
        return Math.abs(elevator.getLevel()-levelGiving);
    }*/

    @Override
    public int distance(Elevator elevator, int levelGiving, int numberOfFloors) {
        return Math.abs(elevator.getLevel()-levelGiving);
    }
}

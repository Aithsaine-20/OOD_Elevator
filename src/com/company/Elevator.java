package com.company;

public class Elevator {

    private int level;
    private StateElevator stateElevator;

    public Elevator(int level) {

        this.level=level;
        stateElevator=new Rest();
    }




    public int distance(int givingLevel,int numbersOfFloors){
        return stateElevator.distance(this,givingLevel,numbersOfFloors);

    }







    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



    public StateElevator getStateElevator() {
        return stateElevator;
    }
    public void setStateElevator(StateElevator stateElevator) {
        this.stateElevator = stateElevator;
    }
}

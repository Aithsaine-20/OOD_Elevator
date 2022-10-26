package com.company;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class Building {
    private int numberOfFloors;
    private HashMap<String,Elevator> elevators=new HashMap<>();
    private ElavatorFactory elavatorFactory= new ElavatorFactory();
    private Dispatcher dispatcher=new Dispatcher();

    // Constructor of the building class
    public Building(int numberOfFloors, String... elevators) {
        // loop through the Strings giving ("id2:4") and extract id and level of all elevators in the building
        for (String id_level:elevators) {
            String[] str = id_level.split(":");
            Elevator elevator = elavatorFactory.createElevator(parseInt(str[1]));
            this.elevators.put(str[0],elevator);
        }
        this.numberOfFloors=numberOfFloors;
    }

    //set the state of an Elavator to Up or Down
    public void move( String idElevator , String stateClassName) throws Exception {
//        StateElevator oState=  (StateElevator) Class.forName(stateClassName).newInstance();
//        elevators.get(idElevator).setStateElevator( oState );
            if (stateClassName=="Up"){
                elevators.get(idElevator).setStateElevator( new Up() );
                //System.out.println("up-----");
            }

            if (stateClassName=="Down"){
                elevators.get(idElevator).setStateElevator( new Down() );
                //System.out.println("down-----");
            }

    }

    //request elevator from the top floor (top level = number of floors )
    public String requestElevator(){
        return requestElevator(numberOfFloors);
    }

    //request Elevetor from a giving floor
    public String requestElevator(int levelGiving){
        return dispatcher.requestElevator(elevators,levelGiving,numberOfFloors);
    }


    public void stopAt(String idElevator , int levelGiving){
        //set the level of elevator to the level giving
        elevators.get(idElevator).setLevel(levelGiving);
        //set the state of the elevator to Stop
        elevators.get(idElevator).setStateElevator(new Stop());
    }

}

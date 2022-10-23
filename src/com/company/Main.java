package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Building building= new Building(10,"id1:1","id2:6","id3:8");
        building.move("id1","Up");
        building.move("id2","Up");
        building.move("id3","Up");
        building.stopAt("id3",7);
        String idoffe= building.requestElevator();
        System.out.println(idoffe);
    }
}

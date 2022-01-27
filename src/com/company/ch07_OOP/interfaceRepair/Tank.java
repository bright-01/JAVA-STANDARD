package com.company.ch07_OOP.interfaceRepair;

public class Tank extends GroundUnit implements Repairable{

    public Tank(int max_hp) {
        super(max_hp);
    }

    public String toString(){
        return "TANK";
    }
}

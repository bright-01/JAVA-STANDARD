package com.company.ch07.interfaceRepair;

public class Dropship extends AirUnit implements Repairable{

    public Dropship(int max_hp) {
        super(max_hp);
    }

    public String toString(){
        return "DROPSHIP";
    }
}

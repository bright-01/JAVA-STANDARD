package com.company.ch07.interfaceRepair;

public class SCV extends GroundUnit implements Repairable{
    public SCV(int max_hp) {
        super(max_hp);
    }

    public void repair(Repairable r){
        if ( r instanceof Unit){
            Unit u = (Unit) r;
            while(u.hitPoint !=u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u.toString() + " 수리가 끝났습니다.");
        }
    }

    public String toString(){
        return "SCV";
    }
}

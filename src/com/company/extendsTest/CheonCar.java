package com.company.extendsTest;

public class CheonCar extends Car{

    int speed;
    boolean right;

    CheonCar(String color, int number, String cost) {
        super(color, number, cost);
    }

    void speedUp(int value){
        speed = value;
    }

    void isRight(){
        right = !right;
    }
}

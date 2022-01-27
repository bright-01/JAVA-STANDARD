package com.company.ch07_OOP.extendsTest;

public class Car {
    String color;
    int number;
    String cost;
    boolean power;

    Car(String color, int number, String cost){
        this.color = color;
        this.number = number;
        this.cost = cost;
        this.power = false;
    }

    void isPower(){
        power = !power;
    }



}

package com.company.ch06;

public class Tv {
    String color;
    boolean power;
    int channel;

    public static String user;
    public static int componentNumber;


    void power() { power = !power; };
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }



}

package com.company.ch13_process_thread.wait_notify;

import java.util.ArrayList;

public class Table {

    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish){
        if(dishes.size() >= MAX_FOOD){
            return;
        }

        dishes.add(dish);
        System.out.println("DISHES : " + dishes.toString());
    }

    public boolean remove(String dishName){
        synchronized (this){
            for(int i=0; i<dishes.size(); i++){
                if(dishName.equals(dishes.get(i))){
                    dishes.remove(i);
                    return true;
                }
            }
            return false;
        }
    }

    public double dishNum() {
        return dishNames.length;
    }
}

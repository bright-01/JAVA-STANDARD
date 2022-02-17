package com.company.ch13_process_thread.wait_notify;

import java.util.ArrayList;

public class Table {

    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish){
        if(dishes.size() >= MAX_FOOD){
            String name = Thread.currentThread().getName();
            System.out.println(name+" is waiting.");
            try {
                wait(); // COOK 쓰레드를 기다리게 한다
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }

        dishes.add(dish);
        notify(); // 기다리고 있는 손님을 깨운다
        System.out.println("DISHES : " + dishes.toString());
    }

    public boolean remove(String dishName){
        synchronized (this){
            String name = Thread.currentThread().getName();
            while(dishes.size()  == 0){
                System.out.println(name + " is waiting.");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while(true){
                for(int i=0; i<dishes.size(); i++){
                    if(dishName.equals(dishes.get(i))){
                        dishes.remove(i);
                        notify(); // COOK 꺠워
                        return true;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public double dishNum() {
        return dishNames.length;
    }
}

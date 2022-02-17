package com.company.ch13_process_thread.Lock_Condition;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Table {

    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    private ReentrantLock lock = new ReentrantLock();
    private Condition forCook = lock.newCondition();
    private Condition forCus = lock.newCondition();

    public synchronized void add(String dish){
        lock.lock();
        try{
            if(dishes.size() >= MAX_FOOD){
                String name = Thread.currentThread().getName();
                System.out.println(name+" is waiting.");
                try {
                    forCook.await();
//                wait(); // COOK 쓰레드를 기다리게 한다
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return;
            }

            dishes.add(dish);
//        notify(); // 기다리고 있는 손님을 깨운다
            forCus.signal();
            System.out.println("DISHES : " + dishes.toString());
        }finally {
            lock.unlock();
        }
    }

    public boolean remove(String dishName){
//        synchronized (this){
        lock.lock();
        try{
            String name = Thread.currentThread().getName();
            while(dishes.size()  == 0){
                System.out.println(name + " is waiting.");
                try {
//                    wait();
                    forCus.await();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while(true){
                for(int i=0; i<dishes.size(); i++){
                    if(dishName.equals(dishes.get(i))){
                        dishes.remove(i);
//                        notify(); // COOK 꺠워
                        forCook.signal();
                        return true;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    forCus.await();
//                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }finally {
            lock.unlock();
        }

//        }
    }

    public double dishNum() {
        return dishNames.length;
    }
}

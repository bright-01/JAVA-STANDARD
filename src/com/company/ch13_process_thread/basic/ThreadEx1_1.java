package com.company.ch13_process_thread.basic;

public class ThreadEx1_1 extends Thread {
    public void run(){
        for(int i=0; i<500; i++){
            System.out.println(getName());
        }
    }
}

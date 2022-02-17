package com.company.ch13_process_thread.priorityOf;

public class ThreadEx6_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("_");
            for (int x = 0; x < 100000; x++) ;
        }
    }
}

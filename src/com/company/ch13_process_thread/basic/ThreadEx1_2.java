package com.company.ch13_process_thread.basic;

public class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

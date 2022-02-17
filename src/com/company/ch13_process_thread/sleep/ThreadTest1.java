package com.company.ch13_process_thread.sleep;

public class ThreadTest1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        System.out.println("A 쓰레드 종료");
    }
}

package com.company.ch13_process_thread.sleep;

public class ThreadTest2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.println("B 쓰레드 종료");
    }
}

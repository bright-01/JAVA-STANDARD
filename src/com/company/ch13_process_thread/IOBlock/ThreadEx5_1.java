package com.company.ch13_process_thread.IOBlock;

class ThreadEx5_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

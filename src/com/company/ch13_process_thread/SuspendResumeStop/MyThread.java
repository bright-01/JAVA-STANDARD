package com.company.ch13_process_thread.SuspendResumeStop;

public class MyThread implements Runnable{
    volatile boolean suspended = false; // 복사본 사용 x 원본을 사용해라
    volatile boolean stopped = false;
    Thread th;

    MyThread(String name){
        th = new Thread(this, name); // Thread ( Runnable r, String name )
    }

    void start (){
        th.start();
    }

    void stop(){
        stopped  = true;
    }

    void suspended(){
        suspended = true;
    }

    void resume(){
        suspended = false;
    }

    @Override
    public void run() {
        while(!stopped){
            if(!suspended){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

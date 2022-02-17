package com.company.ch13_process_thread.yield;

public class YieldThread implements Runnable {
    /**
     * yield()
     * 남은 시간을 다음 쓰레드에게 양보하고, 자신 ( 현재 쓰레드 ) 은 실행대기한다. ==> static 메서드 자기자신만 실행대기
     * yield() 와 interrupt()를 적절히 사용하면, 응답성과 효율을 높일 수 있다.
     */
    volatile boolean suspended = false; // 복사본 사용 x 원본을 사용해라
    volatile boolean stopped = false;
    Thread th;

    YieldThread(String name) {
        th = new Thread(this, name); // Thread ( Runnable r, String name )
    }

    void start() {
        th.start();
    }

    void stop() {
        stopped = true;
        th.interrupt();
    }

    void suspended() {
        suspended = true;
        th.interrupt();
    }

    void resume() {
        suspended = false;
//        th.interrupt();
    }

    @Override
    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            Thread.yield(); // buy-waiting 을 못하도록!
        }
    }
}

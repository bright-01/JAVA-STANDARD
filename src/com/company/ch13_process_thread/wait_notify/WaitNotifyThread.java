package com.company.ch13_process_thread.wait_notify;

public class WaitNotifyThread {
    /**
     * 동기화의 효율을 높이기 위해 wait()-기다리고, notify()-통보 알려주기 를 사용
     * Object 클래스에 정의 되어 있으며, 동기화 블록 내에서만 사용할 수 있다.
     * wait() - 객체의 lock을 풀고 쓰레드의 해당 객체의 waiting pool에 넣는다
     * notify() - waiting pool에서 대기중인 쓰레드 중 하나를 깨운다
     * notifyAll() - waiting pool에서 대기중인 모든 쓰레드를 깨운다
     *
     * */

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Custom(table, "donut"), "CUSTOM1").start();
        new Thread(new Custom(table, "burger"), "CUSTOM2").start();


//        Thread.sleep(10000);
//        System.exit(0);
    }
}

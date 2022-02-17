package com.company.ch13_process_thread.synchronizationThread;

public class SynchronizationThread {
    /**
     * 멀티 쓰레드 프로세스에서는 다른 쓰레드의 작업에 영향을 미칠 수 있다.
     * 진행 중인 작업이 다른 쓰레드에게 간섭을 받지 않게 하려면 동기화가 필요
     * - 쓰레드의 동기화 - 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭 못하게 막는것
     * 동기화하려면 간섭받지 않아야 하는 문장들을 '임계 영역'으로 설정
     * 임계 역역은 락을 얻는 단 하나의 쓰레드만 출입 가능( 객체1개에 락 1개 )
     *
     * synchronized를 이용한 동기화
     * synchronized로 임계역역 ( lock이 걸리는 영역)을 설정하는 방법 2가지
     * 1. 메서드 전체를 임계영역으로 지정
     * public synchronized void calcSum(){} --> 임계 영역 1번에 1쓰레드
     *
     * 2. 특정한 영역을 임계 영역으로 지정
     * synchronized(객체의 참조 변수){}
     *
     * */

    public static void main(String[] args) {
        Runnable r = new AccountThread();
        new Thread(r).start();
        new Thread(r).start();
    }
}

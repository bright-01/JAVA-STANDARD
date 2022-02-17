package com.company.ch13_process_thread.Lock_Condition;

public class LockConditionThread {
    /**
     * ReentrantLock 재진입이 가능한 lock. 가장 일반적인 베타 lock.
     * ReentrantReadWriteLock 읽기에는 공유적이고, 쓰기에는 베타적인 lock
     * StampedLock ReentrantReadWriteLock에 낙관적인 lock의 기능을 추가
     *
     * ReentrantLock()
     * ReentrantLock(boolean fair) true로 주면 lock이 풀렸을 때 가장 오리 기다린 쓰레드가 lock을 획득 할 수 있게, 즉 공정하게 처리 한다.
     *
     * void lock() 잠근다
     * void nulock() 해지한다
     * boolean isLocked 잠겼는지 확인한다.
     *
     * synchronized(lock){  // 임계영영 } ==> lock.lock() // 임계영역 lock.unlock()
     * 예제
     * lock.lock();
     * try{
     *     // 임계영역
     * } finally{
     *     lock.unlock();
     * }
     *
     * tryLocak() 지정한 시간만큼만 lock
     *
     *
     * await() - wait() 같다
     * signal() - notify() 와 같다
     * signalAll() - notifyAll()와 같다
     *
     *
     *
다    * */

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Custom(table, "donut"), "CUSTOM1").start();
        new Thread(new Custom(table, "burger"), "CUSTOM2").start();


//        Thread.sleep(10000);
//        System.exit(0);
    }
}

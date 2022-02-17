package com.company.ch13_process_thread.sleep;


public class ThreadSleep{
    /**
     * sleep()
     * 현재 쓰레드를 지정된 시간동안 멈추게 된다 --> 자기자신만
     * static void sleep( long millis )
     * 예외처리를 해야한다 ( InterruptedException 이 발생하면 깨어남 )
     * try { Thread.sleep(1, 100000)}; } catch (InterruptedException e) {} --> 1. 시간 종료 2. 인터럽트가 깨우는것 -> catch 블록에 아무것도 넣지 않아도 된다. 예외를 발생시켜서 깨는것이기 떄문에
     *  특정 쓰레드를 지정해서 멈추게 하는것이 불가능 하다 ==> t1.sleep(1000) 이렇게 하면 오해함 Thread.sleep(2000) 이렇게 써라
     *
     *
     * */
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadTest1());
        Thread t2 = new Thread(new ThreadTest2());
        t1.start();
        t2.start();

        try {
//            t1.sleep(2000); // main Thread가 잠자게 된다
            Thread.sleep(1000);// 이렇게 써야한다.
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }

        System.out.println("MAIN 종료");

    }
}


package com.company.ch13_process_thread.SuspendResumeStop;

public class SuspendResumeStop {
    /**
     * suspend 쓰레드를 일시정지 시킨다
     * resume suspend에 의해 일시정지된 쓰레드를 실행대기 상태로 만든다
     * stop 쓰레드를 즉시 종료 시킨다.
     * 교착상태에 빠지기 쉬워서 deprecated 되었다.
     *
     *
     *
     * */
    public static void main(String[] args) {
        MyThread t1 = new MyThread("*");
        MyThread t2 = new MyThread("**");
        MyThread t3 = new MyThread("***");
        t1.start();
        t2.start();
        t3.start();

//        Thread tt1 = new Thread(new TestThread());
//        tt1.start();

        try{
            Thread.sleep(2000);
            t1.suspended(); // 중지
            Thread.sleep(2000);
            t2.suspended();
            Thread.sleep(2000);
            t1.resume();
            t1.stop();
            t2.stop();
            Thread.sleep(2000);
            t3.stop();
        }catch(InterruptedException e){}
    }
}

class TestThread implements Runnable{

    @Override
    public void run() {
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
    }
}

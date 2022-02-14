package com.company.ch13_process_thread;

public class ThreadClass {
    /**
     * 프로세스 : 실행중인 프로그램, 자원과 쓰레드로 구성
     * 쓰레드 : 프로세스 내에서 실제 작업을 수행. 모든 프로세스는 최소한 하나의 쓰레드를 가진다.
     * 프로세스 : 쓰레드 = 공장 : 일꾼
     * 하나의 새로운 프로세스를 생성하는 것보다 하나의 새로운 쓰레드를 생성하는것이 더 적은 비용이 든다.
     * 장점 : 시스템 자원을 보다 효율적으로 사용, 사용자 대한 응답성이 향상, 작업이 분리되어 코드가 간결
     * 단점 : 동기화에 주의, 교착상태가 발생하지 않도록 주의, 쓰레드가 효율적으로 고르게 실
     *
     * 1. Thread 클래스를 상속 - 자바는 단일 상속(Thread를 상속 받으면 다른걸 상속 받지 못하니까)이라 Runnalbe 인터페이스를 구현하는게 좋다
     * class MyThread extends Thread { public void run() // Thread의 Run을 오버라이딩 { // 내용} }
     * MyThread t1 = new MyThread(); t1.start();
     *
     * 2. Runnable인터페이스 구현
     * class MyThread2 implements Runnalbe { public void run() // Runnalbe 인터피에스의 추상메서드 run() 을 구현 { // 작업 내용 } }
     *Runnable r = new MyThread2(); Thread t2 = new Thread(r); t2.start();
     *
     * run을 작성하는것은 똑같음 -> 작업내용을 적어준다
     * start() - 실행 메서드
     * join() - main 쓰레드가 다른 쓰레드의 작업을 기다린다.
     * 실행중인 사용자 쓰레드가 없으면 종료된다다
     *
     * 쓰레드의 IO 블락킹
     * 입출력시 작업이 중단 되는것
     *
     *
     * * */


    static long startTime = 0;
    public static void main(String args []){
        ThreadEx1_1 t1 = new ThreadEx1_1();
        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);
        startTime = System.currentTimeMillis();

        t1.start();
        t2.start();

        try{
            // main 쓰레드가 t1, t2 작업이 끝날때 까지 기다린다
            t1.join();
            t2.join();
        } catch(InterruptedException e){
        }
        System.out.println("소요시간 "+ (System.currentTimeMillis() - startTime));

    }
}

class ThreadEx1_1 extends Thread {
    public void run(){
        for(int i=0; i<500; i++){
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run(){
        for (int i =0 ; i<500; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
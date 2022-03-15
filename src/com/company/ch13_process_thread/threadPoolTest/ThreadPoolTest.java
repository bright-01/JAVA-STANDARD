package com.company.ch13_process_thread.threadPoolTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i =0; i<10; i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 수 ] + "+ poolSize + " | [작업 스레드 이름 ] " + threadName);
                    try {
                        new ThreadTest().startThread();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int value = Integer.parseInt("삼");

                }
            };

            executorService.submit(runnable);
            Thread.sleep(10);
        }
        executorService.shutdown();
    }
}

class ThreadTest {
    ExecutorService executorService2 = Executors.newFixedThreadPool(10);

    public void startThread() throws InterruptedException {
        for(int i =0; i<10; i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService2;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 수22222222 ] + "+ poolSize + " | [작업 스레드 이름222222222 ] " + threadName);



                    int value = Integer.parseInt("삼");

                }
            };
            executorService2.submit(runnable);
            Thread.sleep(1000);
        }
        executorService2.shutdown();
    }
}

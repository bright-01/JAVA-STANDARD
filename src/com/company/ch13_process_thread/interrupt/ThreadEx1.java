package com.company.ch13_process_thread.interrupt;

class ThreadEx1 extends Thread {
    public void run(){
        int i = 100;
        while (i!=0 && !isInterrupted()){
            System.out.println(i--);
            for(long x=0; x<250000000L; x++);

        }
        System.out.println("카운터가 종료되었습니다.");
    }
}

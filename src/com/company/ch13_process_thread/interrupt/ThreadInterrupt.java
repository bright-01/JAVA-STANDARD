package com.company.ch13_process_thread.interrupt;

import javax.swing.*;

public class ThreadInterrupt {
    /**
     * interrupt()
     *  대기 상태 ( WAITING 작업 중단 sleep, join) 인 쓰레드를 실행대기 상태 (RUNNABLE )로 만든다
     *  void interrupt() 쓰레드의 interrupted 상태를 false 에서 true 로 변경
     *  boolean isInterrupted() 쓰레드의 interrupted 상태를 반환
     *  static boolean interrupted() 현재 쓰레드의 interrupted 상태를 알려주고, false 로 초기화
     *  */

    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();
        t1.start();

        System.out.println("isInterrupted() : "+ t1.isInterrupted());

        String input = JOptionPane.showInputDialog("입력");
        System.out.println("입력값은 : "+input);

        t1.interrupt();
        System.out.println("isInterrupted() : "+ t1.isInterrupted());
        System.out.println("isInterrupted() : "+ t1.isInterrupted());
        System.out.println("isInterrupted() : "+ Thread.interrupted()); // 이건 지금 수행하고 있는 메서드의 쓰레드 상태.. main

    }

}


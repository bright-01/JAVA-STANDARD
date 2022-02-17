package com.company.ch13_process_thread.priorityOf;

public class PriorityOfThread {
    /**
     * 쓰레드의 우선순위
     * - 작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수 있다다
     * void setPriority(int newPriority) 쓰레드의 우선 순위를 지정한 값으로 변경
     * int getPriority() 쓰레드의 우선순위를 반환한다.
     *
     * 쓰레드 그룹
     * 서로 관련된 쓰레드를 그룹으로 묶어서 다루기 위한 것
     * 모든 쓰레드는 반드시 하나의 쓰레드 그룹에 포함되어 있어야한다
     * 쓰레드 그룹을 지정하지 않고 생성한 쓰레드는 main쓰레드 그룹에 속한다
     * 자신을 생성한 쓰레드( 부모 쓰레드)의 그룹과 우선 순위를 상속 받는다.
     * ThreadGroup getThreadGroup() 쓰레드 자신이 속한 쓰레드 그룹을 반환한다.
     *
     * * */

    public static void main(String[] args) {
        ThreadEx6_1 t1 = new ThreadEx6_1();
        ThreadEx6_2 t2 = new ThreadEx6_2();

        t2.setPriority(7);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();


    }


}


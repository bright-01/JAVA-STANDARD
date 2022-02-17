package com.company.ch13_process_thread.daemon;

public class DaemonThread implements Runnable{
    /**
     *데몬쓰레드
     * 일반쓰레드(non-daemon thread)의 작업을 돕는 보조적인 역활 수행
     * 일반쓰레다가 모두 종료되면 자동적으로 종료된다.
     * 가비지 컬렉터, 자동저장, 화면 자동 갱신등에 사용.
     *
     * 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성
     * boolean isDaemon() - 쓰레드가 데몬 쓰레드인지 확인한다. 데몬 쓰레드면 true 반환
     * void setDaemon(boolean on ) 쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경, 매개변수 on을 true로 지정하면 데몬 쓰레드가 된다.
     *
     * setDaemon(boolean on)은 반드시 start() 호출하기 전에 실행되어야 한다. 그렇지 않으면 IllegalThreadStateException이 발생한다.
     *
     */

    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThread());
        t.setDaemon(true);
        t.start();

        for(int i=1; i<10; i++){
            try{
                Thread.sleep(3*1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%2==0){
                autoSave = true;
            }else{
                autoSave = false;
            }
        }
        System.out.println("프로그램 종료함");
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1*1000);
            }catch(InterruptedException e){

            }
            if(autoSave){
                autoSave();
            }else{
                System.out.println("저장 실패");
            }
        }
    }

    public void autoSave(){
        System.out.println("자동저장");
    }
}

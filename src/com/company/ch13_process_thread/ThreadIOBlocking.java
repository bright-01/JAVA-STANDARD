package com.company.ch13_process_thread;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class ThreadIOBlocking {

    public static void main(String[] args) {
        ThreadEx5_1 t5 = new ThreadEx5_1();

        t5.start();

//        for(int i=10; i>0;i--){
//            System.out.println(i);
//            try{
//                sleep(500);
//            }catch (Exception e){}
//        }

        String input = JOptionPane.showInputDialog("아무거나 입력");
        System.out.println(input);
    }

}

class ThreadEx5_1 extends Thread{
    public void run(){
        for(int i=10; i>0;i--){
            System.out.println(i);
            try{
                sleep(500);
            }catch (Exception e){}
        }
    }
}

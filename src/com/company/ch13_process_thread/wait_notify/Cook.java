package com.company.ch13_process_thread.wait_notify;

public class Cook implements Runnable{

    private Table table;

    Cook(Table table){
        this.table = table;
    }


    @Override
    public void run() {
        while(true){
            int idx = (int) (Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);

            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {}
        }

    }
}

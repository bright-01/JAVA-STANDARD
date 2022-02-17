package com.company.ch13_process_thread.wait_notify;

public class Custom implements Runnable{

    private Table table;
    private String food;

    Custom(Table table, String food){
        this.table = table;
        this.food = food;
    }

    boolean  eatFood(){
        return table.remove(food);
    }

    @Override
    public void run() {
        while(true){
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            String name = Thread.currentThread().getName();
            if(eatFood()){
                System.out.println(name + " ate a "+ food);
            }else {
                System.out.println(name + " failed to eat. :(");
            }
        }
    }
}

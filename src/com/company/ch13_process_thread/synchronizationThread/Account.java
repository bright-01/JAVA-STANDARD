package com.company.ch13_process_thread.synchronizationThread;

public class Account {
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    public synchronized void withdraw(int money){
        if(balance >= money){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            balance -= money;
        }
    }
}

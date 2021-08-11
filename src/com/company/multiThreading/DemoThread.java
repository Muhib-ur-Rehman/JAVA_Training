package com.company.multiThreading;

public class DemoThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i =0; i <5 ; i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.company.multiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DemoThread demoThread1 = new DemoThread();
        Thread thread1 = new Thread(demoThread1);
        thread1.start();
        DemoThread demoThread2 = new DemoThread();
        Thread thread2 = new Thread(demoThread2);
        thread2.start();
        thread1.join();
        thread2.join();

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

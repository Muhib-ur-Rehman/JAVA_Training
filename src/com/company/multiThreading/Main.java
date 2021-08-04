package com.company.multiThreading;

public class Main {
    public static void main(String[] args) {

        DemoThread demoThread1 = new DemoThread();
        Thread thread1 = new Thread(demoThread1);
        thread1.start();
        DemoThread demoThread2 = new DemoThread();
        Thread thread2 = new Thread(demoThread2);
        thread2.start();
    }
}

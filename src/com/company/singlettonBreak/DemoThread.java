package com.company.singlettonBreak;

public class DemoThread extends Thread{
    public void run(){
        Singleton1 s1 = Singleton1.getObj()  ;
        System.out.println("Hash code : "+s1);
    }
}

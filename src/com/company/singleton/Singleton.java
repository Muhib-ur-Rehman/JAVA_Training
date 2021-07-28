package com.company.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){};

    public static Singleton makeObj(){
        return instance;
    }

    public void showMsg(){
        System.out.println("done...");
    }

}

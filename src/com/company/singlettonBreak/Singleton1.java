package com.company.singlettonBreak;


public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){};

    public static Singleton1 getObj(){
        if (instance==null){
            instance = new Singleton1();
        }
        return instance;
    }
}

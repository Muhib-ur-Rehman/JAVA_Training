package com.company.singleton;

public class Singleton{

    private static Singleton instance;

    private Singleton(){};

    public static Singleton makeObj(){
        if (instance==null){
            synchronized (Singleton.class) {
                if (instance==null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

}

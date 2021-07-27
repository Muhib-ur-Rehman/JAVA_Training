package com.company.singleton;

public class singleton {

    private static singleton instance = new singleton();

    private singleton(){};

    public static singleton makeObj(){
        return instance;
    }

    public void showMsg(){
        System.out.println("done...");
    }

}

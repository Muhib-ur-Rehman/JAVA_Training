package com.company.exceptionHandling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String s1 = null;
        if (s1==null){
            try {
                throw new NullStringException("String can not be null");
            } catch (NullStringException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done...");
    }
}

package com.company.stringBuilderVsStringBuffer;

public class StringBuilderVsStringBuffer {
    public void doCheck(){

        StringBuilder sbd = new StringBuilder("Java is an Object Oriented Language");
        Long start2 = System.currentTimeMillis();
        for (int j =0 ; j<1000;j++) {
            for (int i = 0; i < sbd.length(); i++) {
                System.out.println(sbd.charAt(i));
            }
        }
        Long end2 = System.currentTimeMillis();
        Long finalTime2 = end2 - start2;

        StringBuffer sb = new StringBuffer("Java is an Object Oriented Language");
        Long start1 = System.currentTimeMillis();
        for (int j =0 ; j<1000;j++) {
            for (int i = 0; i < sb.length(); i++) {
                System.out.println(sb.charAt(i));
            }
        }
        Long end1 = System.currentTimeMillis();
        Long finalTime1 = end1 - start1;

        System.out.println("Time taken by String Builder -> "+finalTime2);
        System.out.println("Time taken by String Buffer -> "+finalTime1);
        System.out.println("String Builder is faster then String Buffer...");
    }
}

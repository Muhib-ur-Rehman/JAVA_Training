package com.company.arraylistVSlinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(44);
        arrayList.add(-9);
        arrayList.add(14);
        arrayList.add(123);
        arrayList.add(56);
        arrayList.add(223);
        arrayList.add(445);
        arrayList.add(33);
        arrayList.add(45);
        arrayList.add(89);
        arrayList.add(1);
        arrayList.add(0);
        arrayList.add(21);
        arrayList.add(100);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(23);
        linkedList.add(44);
        linkedList.add(-9);
        linkedList.add(14);
        linkedList.add(123);
        linkedList.add(56);
        linkedList.add(223);
        linkedList.add(445);
        linkedList.add(33);
        linkedList.add(45);
        linkedList.add(89);
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(21);
        linkedList.add(100);

        //************************************SEARCHING IN LINKED LIST************************************************
        Long startTimeForLinklist = System.currentTimeMillis();
        for (int i=0 ; i<linkedList.size();i++){
            if (linkedList.get(i)==100){
                System.out.println("found at "+i);
                break;
            }
        }
        Long endTimeForLinklist = System.currentTimeMillis();
        Long timeTakenByLinklist = endTimeForLinklist - startTimeForLinklist;
        System.out.println("Found 100 in linked list in "+timeTakenByLinklist+" ms");

        //************************************SEARCHING IN ARRAY LIST**************************************************

        Long startTimeForArraylist = System.currentTimeMillis();
        for (int i = 0 ; i < arrayList.size();i++){
            if (arrayList.get(i)==100){
                System.out.println("found at "+i);
                break;
            }
        }
        Long endTimeForArraylist = System.currentTimeMillis();
        Long timeTakenByArraylist = endTimeForArraylist-startTimeForArraylist;
        System.out.println("Found 100 in array list in "+timeTakenByArraylist+" ms");

        //******************************************FINAL RESULT*******************************************************

        if (timeTakenByArraylist > timeTakenByLinklist){
            System.out.println("Linked list is faster then Array List....");
        }
        else{
            System.out.println("Array List is faster then Linked list....");
        }
    }
}

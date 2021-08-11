package com.company.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(22);
        System.out.println("Found at index : "+Collections.binarySearch(arrayList,12));

    }
}

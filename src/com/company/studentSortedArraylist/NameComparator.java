package com.company.studentSortedArraylist;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        int result = s1.name.compareTo(s2.name);
        if (result == 0){
            AgeComparator ac = new AgeComparator();
            result=ac.compare(s1,s2);
        }
        return result;
    }
}

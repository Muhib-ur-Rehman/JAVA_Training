package com.company.studentSortedArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> arrayListOfStudent = new ArrayList<>();
        arrayListOfStudent.add(new Student(1,"Ali",18));
        arrayListOfStudent.add(new Student(2,"Hassan",22));
        arrayListOfStudent.add(new Student(3,"Talha",20));
        arrayListOfStudent.add(new Student(4,"Naeem",25));
        arrayListOfStudent.add(new Student(5,"Hamza",16));
        arrayListOfStudent.add(new Student(6,"Talha",15));

        Collections.sort(arrayListOfStudent, new NameComparator());
        Iterator itr = arrayListOfStudent.iterator();
        int i =0;
        while (itr.hasNext()){
            Student st = (Student) itr.next();
            arrayListOfStudent.set(i,st);
            i++;
        }

        System.out.println("Student list after sorting...");
        for ( i =0 ; i<arrayListOfStudent.size();i++){
            Student st = arrayListOfStudent.get(i);
            System.out.println("ID = "+st.id + " , Name = "+st.name+" , Age = "+ st.age);
        }

    }
}

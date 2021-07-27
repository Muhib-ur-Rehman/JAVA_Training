package com.company;

import com.company.aggregation.department;
import com.company.aggregation.std;
import com.company.composition.book;
import com.company.composition.library;
import com.company.encapsulation.student;
import com.company.inheritance.cat;
import com.company.inheritance.dog;
import com.company.singleton.singleton;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Task 1: Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)
        student s1 = new student("Ali",2,"Male",12);
        System.out.println(s1.toString());

        // Task 2: Write a program in java that implements Singleton design pattern.
        //The program should only make One object and upon creating another object, it should return the same object.
        // Also confirm this behaviour by prinitng the object. Another way to determine same object is the ""=="" operator,
        // it should return `true` if you have same object in both references.
        singleton obj1 = singleton.makeObj();
        singleton obj2 = singleton.makeObj();
        System.out.println("Object 1 = "+obj1);
        System.out.println("Object 2 = "+obj2);
        if (obj1==obj2){
            System.out.println("sameeee");
        }

        //Task 3.1: Create an example of inheritance
        dog d1 = new dog();
        d1.eat();
        d1.bark();
        cat c1 = new cat();
        c1.eat();
        c1.meow();

        //Task 3.2: Compose a class with composition
        book b1 = new book("War or Peace",1200);
        book b2 = new book("Mr Perfect",1500);
        book b3 = new book("Global warming",2000);
        ArrayList<book> listOfBooks = new ArrayList<>();
        listOfBooks.add(b1);
        listOfBooks.add(b2);
        listOfBooks.add(b3);
        library l1 = new library(listOfBooks);
        for (int i =0 ; i<l1.list.size(); i++){
            System.out.println("Name : "+l1.list.get(i).name + " and price : "+l1.list.get(i).price);
        }

        //Task 3.3: Compose a class with aggregation
        std st1 =new std("Hassan","CS");
        std st2 =new std("Ahmed","CS");
        std st3 =new std("Nasir","maths");
        std st4 =new std("Saad","maths");
        ArrayList<std> listOfCS = new ArrayList<>();
        listOfCS.add(st1);
        listOfCS.add(st2);
        ArrayList<std> listOfMaths = new ArrayList<>();
        listOfMaths.add(st3);
        listOfMaths.add(st4);
        department CSdep = new department("CS",listOfCS);
        department mathsDep = new department("maths",listOfMaths);
        ArrayList<std> csDepStd = CSdep.showStudents();
        for (int i=0; i<csDepStd.size();i++){
            System.out.println("Student name: "+csDepStd.get(i).name +" , Department Name: "+csDepStd.get(i).dept);
        }

        // Task 4: Abstract class and interface. (difference) interface mulitple inheritance (if both interfaces method same then
        // what is the behaviour, abstract class and interface)
        // Answer: in both cases if a class is implementing 2 interfaces or 1 interface and 1 abstract class with same method then if
        // the return type is same it will implement that method but if return type is not same it will give error.

    }
}

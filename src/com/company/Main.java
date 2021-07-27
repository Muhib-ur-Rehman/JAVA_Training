package com.company;

import com.company.encapsulation.student;
import com.company.inheritance.cat;
import com.company.inheritance.dog;
import com.company.singleton.singleton;

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
    }
}

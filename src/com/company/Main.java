package com.company;

import com.company.abstraction.Employee;
import com.company.aggregation.Department;
import com.company.aggregation.DepartmentStudent;
import com.company.compileTimePolymorphisim.Shapes;
import com.company.composition.Book;
import com.company.composition.Library;
import com.company.doCompare.DoCompare;
import com.company.encapsulation.Student;
import com.company.inheritance.Cat;
import com.company.inheritance.Dog;
import com.company.multipleInheritance.Developer;
import com.company.runTimePolymorphisim.Circle;
import com.company.runTimePolymorphisim.Rectangle;
import com.company.runTimePolymorphisim.Shapes1;
import com.company.runTimePolymorphisim.Triangle;
import com.company.singleton.Singleton;
import com.company.stringBuilderVsStringBuffer.StringBuilderVsStringBuffer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {

        // Task 1: Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)
        System.out.println("Result of Encapsulation Task :");
        Student s1 = new Student("Ali",2,"Male",12);
        System.out.println(s1.toString());

        // Task 2: Write a program in java that implements Singleton design pattern.
        //The program should only make One object and upon creating another object, it should return the same object.
        // Also confirm this behaviour by prinitng the object. Another way to determine same object is the ""=="" operator,
        // it should return `true` if you have same object in both references.
        System.out.println("\nResult of SingleTon Task :");
        Singleton obj1 = Singleton.makeObj();
        Singleton obj2 = Singleton.makeObj();
        System.out.println("Object 1 = "+obj1);
        System.out.println("Object 2 = "+obj2);
        if (obj1==obj2){
            System.out.println("Samee....");
        }

        //Task 3.1: Create an example of inheritance
        System.out.println("\nResult of Inheritance Task :");
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        Cat c1 = new Cat();
        c1.eat();
        c1.meow();

        //Task 3.2: Compose a class with composition
        System.out.println("\nResult of Composition Task :");
        Book b1 = new Book("War or Peace",1200);
        Book b2 = new Book("Mr Perfect",1500);
        Book b3 = new Book("Global warming",2000);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(b1);
        listOfBooks.add(b2);
        listOfBooks.add(b3);
        Library l1 = new Library(listOfBooks);
        for (int i =0 ; i<l1.list.size(); i++){
            System.out.println("Name : "+l1.list.get(i).name + " and price : "+l1.list.get(i).price);
        }

        //Task 3.3: Compose a class with aggregation
        System.out.println("\nResult of Aggregation Task :");
        DepartmentStudent st1 =new DepartmentStudent("Hassan","CS");
        DepartmentStudent st2 =new DepartmentStudent("Ahmed","CS");
        DepartmentStudent st3 =new DepartmentStudent("Nasir","maths");
        DepartmentStudent st4 =new DepartmentStudent("Saad","maths");
        ArrayList<DepartmentStudent> listOfCS = new ArrayList<>();
        listOfCS.add(st1);
        listOfCS.add(st2);
        ArrayList<DepartmentStudent> listOfMaths = new ArrayList<>();
        listOfMaths.add(st3);
        listOfMaths.add(st4);
        Department CSdep = new Department("CS",listOfCS);
        Department mathsDep = new Department("maths",listOfMaths);
        ArrayList<DepartmentStudent> csDepDepartmentStudent = CSdep.showStudents();
        for (int i=0; i<csDepDepartmentStudent.size();i++){
            System.out.println("Student name: "+csDepDepartmentStudent.get(i).name +" , Department Name: "+csDepDepartmentStudent.get(i).dept);
        }

        // Task 4: Abstract class and interface. (difference) interface mulitple inheritance (if both interfaces method same then
        // what is the behaviour, abstract class and interface)
        // Answer: In both cases if a class is implementing 2 interfaces or 1 interface and 1 abstract class with same method then if
        // the return type is same it will implement that method but if return type is not same it will give error.

        // Tasks of abstraction and polymorphisim
        // "Task 1: Write a program in java that computes the areas of Circle, Triangle and Rectangle using Compile-Time polymorphism.
        //   HINT: You can Use only one method name for calculating area of all the shapes - e.g:""calculateArea()""
        //   Limitations: Inheritance is not allowed.

//        Scanner sc = new Scanner(System.in);
//        Shapes shapes = new Shapes();
//        System.out.println("Select shape of which you want to calculate area: ");
//        System.out.println("1. Circle");
//        System.out.println("2. Triangle");
//        System.out.println("3. Rectangle");
//        int choice = sc.nextInt();
//        float area=0.0f;
//        switch (choice){
//            case 1:
//                System.out.println("Enter radius ?");
//                int radius=sc.nextInt();
//                area=shapes.calculateArea(3.14f,radius);
//                break;
//            case 2:
//                System.out.println("Enter base ?");
//                int base = sc.nextInt();
//                System.out.println("Enter height ?");
//                int height = sc.nextInt();
//                area=shapes.calculateArea(0.5f,base,height);
//                break;
//            case 3:
//                System.out.println("Enter Length ?");
//                int length = sc.nextInt();
//                System.out.println("Enter breath ?");
//                int breath = sc.nextInt();
//                area=shapes.calculateArea(length,breath);
//                break;
//            default:
//                System.out.println("Wrong selection of choice");
//        }
//        System.out.println("Area is -> "+area);

        // Task 2:  Write a program in java that computes the areas of Circle, Triangle and Rectangle using Run-Time polymorphism.
        //   HINT: 1. You can Use only one method name for calculating area of all the shapes - e.g:""calculateArea()"".
        //   2. Inheritance is allowed.

//        Scanner sc = new Scanner(System.in);
//        Shapes1 shapes1 = null;
//        System.out.println("Select shape of which you want to calculate area: ");
//        System.out.println("1. Circle");
//        System.out.println("2. Triangle");
//        System.out.println("3. Rectangle");
//        int choice = sc.nextInt();
//        float area=0.0f;
//        switch (choice){
//            case 1:
//                System.out.println("Enter radius ?");
//                int radius=sc.nextInt();
//                shapes1= new Circle();
//                area=shapes1.calculateArea(3.14f,radius);
//                break;
//            case 2:
//                System.out.println("Enter base ?");
//                int base = sc.nextInt();
//                System.out.println("Enter height ?");
//                int height = sc.nextInt();
//                shapes1=new Triangle();
//                area=shapes1.calculateArea(0.5f,base,height);
//                break;
//            case 3:
//                System.out.println("Enter Length ?");
//                int length = sc.nextInt();
//                System.out.println("Enter breath ?");
//                int breath = sc.nextInt();
//                shapes1=new Rectangle();
//                area=shapes1.calculateArea(length,breath);
//                break;
//            default:
//                System.out.println("Wrong selection of choice");
//        }
//        System.out.println("Area is -> "+area);

        // Task 3: Write a program in java to implement abstraction, the program should have two classes ""Person"" and ""Employee""
        // but it should not expose the details of ""Person"" class by using Abstraction.
        System.out.println("\nResult of abstraction :");
        Employee e1 = new Employee("Ali","North karachi","Programming",50000);
        e1.getHobby();
        e1.getIncome();
        System.out.println(e1.printPerson());

        // Task 4: Write a code to achieve multiple inheritance in java.
        System.out.println("\nResult of Multiple Inheritance:");
        Developer developer1 = new Developer();
        System.out.println(developer1.getName());
        developer1.doFun();
        developer1.doWork();
        System.out.println(developer1.getSalary());

        // Task of Language Package:
        // Task 1 : Write a java program to understand the difference between String literal and String Object. Also use ""equals()"" method and
        // ""=="" operator to compare these Strings.

        System.out.println("\nResults of String Literal vs String Object");
        String text1 = "",text2 = "";
        Long start1 = System.currentTimeMillis();
        for (int i =0;i<100000;i++){
            text1 = "He is a good boy.";
        }
        Long end1 = System.currentTimeMillis();
        Long finalTime1 = end1 - start1;
        System.out.println("Time taken by String Literal -> "+finalTime1);

        Long start2 = System.currentTimeMillis();
        for (int i =0;i<100000;i++){
            text2 = new String("He is a good boy.");
        }
        Long end2 = System.currentTimeMillis();
        Long finalTime2 = end2 - start2;
        System.out.println("Time taken by String Object -> "+finalTime2);
        System.out.println("So the major difference between them is that, String Literal is much more faster then String Object in performance.");
        if (text1.equals(text2)){
            System.out.println("equals() method is working.");
        }else {
            System.out.println("equals() method is not working.");
        }
        if (text1==text2){
            System.out.println("== operator is working.");
        }else {
            System.out.println("== operator is not working.");
        }

        // Task 3: Write a java program to make a String(""Java is an Object Oriented Language"") using ""StringBuffer"" and ""StringBuilder"" and
        //also traverse through both the Strings and print the traversal time in milliseconds. Also observe which String class is faster than the other.
        System.out.println("\n Result of task String Builder VS String Buffer");
        StringBuilderVsStringBuffer stringBuilderVsStringBuffer = new StringBuilderVsStringBuffer();
        stringBuilderVsStringBuffer.doCheck();

        // Task 2: Write a java program to compare two Strings using ""compareTo()"" method.

        System.out.println("\nResult of doCompare() method :");
        DoCompare dc = new DoCompare();
        System.out.println("Result after comparision is "+dc.doCompare("Hello","Flag"));

    }


}

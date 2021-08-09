package com.company.studentDetails;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statement statement = null;
        try {
            statement= ConnectingDB.establishConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        while (true) {
            Boolean doExit = false;
            System.out.println("Enter your choice:");
            System.out.println("1. Insert Student");
            System.out.println("2. Search Student");
            System.out.println("3. View all Students");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter student name?");
                    String name = sc.next();
                    System.out.println("Enter sex?");
                    String sex = sc.next();
                    System.out.println("Enter roll number?");
                    int rollNum = sc.nextInt();
                    System.out.println("Enter age?");
                    int age = sc.nextInt();
                    Student st = new Student(name,sex,rollNum,age);
                    String query = "INSERT INTO student (`Name`, `Sex`, `RollNum`, `Age`) VALUES ('"+st.studentName+"', '"+st.sex+"', '"+st.rollNum+"', '"+st.age+"')";
                    try {
                        statement.executeUpdate(query);
                        System.out.println("Records inserted in Data Base successfully...");
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("Enter student id to search?");
                    int id = sc.nextInt();
                    query = "Select * from student where StudentId = "+id;
                    try {
                        ResultSet rs = statement.executeQuery(query);
                        if (rs.next()) {
                            rs.beforeFirst();
                            System.out.println("Record of searched student...");
                            while (rs.next()) {
                                System.out.println("ID : "+rs.getString(1)+" , NAME : " + rs.getString(2)+" , Sex : "+rs.getString(3)+" , Roll Number : "+rs.getString(4)+" , Age : "+rs.getString(5));
                            }
                        }
                        else{
                            System.out.println("None of the student holds this id...");
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Records of all students...");
                    query = "Select * from student";
                    try {
                        ResultSet rs = statement.executeQuery(query);
                        if (rs.next()) {
                            rs.beforeFirst();
                            while (rs.next()){
                                System.out.println("ID : "+rs.getString(1)+" , NAME : " + rs.getString(2)+" , Sex : "+rs.getString(3)+" , Roll Number : "+rs.getString(4)+" , Age : "+rs.getString(5));
                            }
                        }
                        else{
                            System.out.println("There is no record in database...");
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 0:
                   doExit = true;
                   break;
            }
            if (doExit){
                break;
            }
        }


    }
}

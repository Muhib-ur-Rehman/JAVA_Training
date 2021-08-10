package com.company.studentCourse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Statement statement = null;
        try {
            statement = ConnectingDB.establishConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        while (true){
            System.out.println("Enter your choice:");
            System.out.println("1. Search student's course");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            boolean doExit = false;
            switch (choice){
                case 1:
                    System.out.println("Enter roll number of student ?");
                    int rollNum = sc.nextInt();
                    String query = "Select s.Name , s.RollNum, c.courseCode, c.courseName from student as s inner join course as c on s.courseId = c.courseId where s.RollNum="+rollNum;
                    try {
                        ResultSet rs = statement.executeQuery(query);
                        if (rs.next()){
                            rs.beforeFirst();
                            while (rs.next()){
                                System.out.println("Name : "+ rs.getString(1)+" , Roll Number : "+rs.getString(2)+" , Course code : "+rs.getString(3)+" , Course Name : "+rs.getString(4));
                            }
                        }
                        else {
                            System.out.println("None of the student has this roll number...");
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 0:
                  doExit = true;
                  break;
                default:
                    System.out.println("Wrong choice...");
            }
            if (doExit){
                break;
            }
        }
    }
}

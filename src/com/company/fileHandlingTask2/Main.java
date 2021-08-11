package com.company.fileHandlingTask2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\mrehman\\IdeaProjects\\JAVA_Trainig\\File handling task files");
        String[] list = myObj.list();
        System.out.println("List of all files in (File handling task files) folder...");
        for (int i =0;i<list.length;i++){
            System.out.println(i+1 + ". "+list[i]);
        }

    }
}

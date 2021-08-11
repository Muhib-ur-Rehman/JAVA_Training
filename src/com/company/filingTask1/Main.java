package com.company.filingTask1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
            File myObj = new File("C:\\Users\\mrehman\\IdeaProjects\\JAVA_Trainig\\File handling task files\\file1.txt");
            try {
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(myObj);
            fileWriter.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

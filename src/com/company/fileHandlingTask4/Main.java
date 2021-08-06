package com.company.fileHandlingTask4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\mrehman\\IdeaProjects\\JAVA_Trainig\\File handling task files\\file1.txt");
        Scanner sc = new Scanner(file);

        File myObj = new File("C:\\Users\\mrehman\\IdeaProjects\\JAVA_Trainig\\File handling task files\\file2.txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }

        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(myObj));

        while (sc.hasNextLine()){
            String text = sc.nextLine();
            bufferedWriter.write(text);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("Content of file 1 has copied to file 2...");

    }
}

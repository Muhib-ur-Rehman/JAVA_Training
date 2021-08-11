package com.company.fileHandlingTask5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\mrehman\\IdeaProjects\\JAVA_Trainig\\File handling task files\\About java.txt");
        Scanner sc = new Scanner(file);

        int counter =0 ;
        while (sc.hasNext()){
            String word = sc.next();
            word=word.toLowerCase(Locale.ROOT);
            System.out.println(word);
            if (word.equals("java")){
                counter++;
            }
        }

        System.out.println("The word Java is used "+counter+" times in this file.");
    }
}

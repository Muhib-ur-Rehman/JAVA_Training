package com.company.fileHandlingTask6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\mrehman\\IdeaProjects\\JAVA_Trainig\\File handling task files\\About java.txt");
        Scanner sc = new Scanner(file);
        ArrayList<WordCounter> listOfWords = new ArrayList<>();


        while (sc.hasNext()){
            String word = sc.next();
            word=word.toLowerCase(Locale.ROOT);
            WordCounter.checkWordInList(listOfWords,word);
        }

        for (int i=0;i<listOfWords.size();i++){
            System.out.println(listOfWords.get(i).word+" : "+listOfWords.get(i).counter);
        }
    }
}

package com.company.fileHandlingTask6;

import java.util.ArrayList;

public class WordCounter {
    public String word;
    public int counter;

    public WordCounter(String word, int counter) {
        this.word = word;
        this.counter = counter;
    }

    public static void checkWordInList(ArrayList<WordCounter> list, String word){
        boolean flag = true;
        for (int i =0;i<list.size();i++){
            if (list.get(i).word.equals(word)){
                list.get(i).counter++;
                flag=false;
                break;
            }
        }
        if (flag){
            list.add(new WordCounter(word,1));
        }
    }
}

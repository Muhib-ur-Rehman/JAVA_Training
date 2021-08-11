package com.company.fileHandlingTask3;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\mrehman\\IdeaProjects\\JAVA_Trainig\\File handling task files");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase(Locale.ROOT);
                if (lowercaseName.endsWith(".txt")||lowercaseName.endsWith(".bmp")){
                    return true;
                }
                else {
                    return false;
                }
            }
        };

        String[] list = file.list(filter);
        System.out.println("List of text and image files in (File handling task files) folder...");
        for (int i = 0 ; i<list.length; i++) {
            System.out.println(i+1+". "+list[i]);
        }
    }
}

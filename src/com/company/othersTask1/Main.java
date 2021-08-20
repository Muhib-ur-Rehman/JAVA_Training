package com.company.othersTask1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{0,1}[a-zA-Z\\s]*");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to check??");
        String text = sc.next();
        Matcher matcher = pattern.matcher(text);
        Boolean result = matcher.matches();
        if (result){
            System.out.println("Valid String!!!");
        }
        else {
            System.out.println("Invalid String!!!");
        }
    }
}

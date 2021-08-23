package com.company.othersTask3LeapYear;

import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any year to check is this leap year or not ??");
        Scanner sc = new Scanner(System.in);
        Long year = sc.nextLong();
        boolean result = Year.isLeap(year);
        if (result){
            System.out.println(year+" is a leap year...");
        }
        else{
            System.out.println(year+" is not a leap year...");
        }

    }
}

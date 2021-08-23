package com.company.othersTask4DateFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now().plusMonths(1).minusDays(15);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E MMM d hh:mm:ss yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy MMM d hh:mm:ss");
        String date1 = localDateTime.format(dateTimeFormatter);
        String date2 = localDateTime.format(dateTimeFormatter1);
        System.out.println("Date Format 1 : "+date1);
        System.out.println("Date Format 2 : "+date2);
    }
}

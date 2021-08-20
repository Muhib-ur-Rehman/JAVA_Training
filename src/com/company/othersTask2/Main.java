package com.company.othersTask2;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Long ms = Instant.now().toEpochMilli();
        Long sc = Instant.now().getEpochSecond();
        System.out.println("Seconds since 1970 : "+sc);
        System.out.println("MiliSeconds since 1970 : "+ms);
    }
}

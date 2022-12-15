package com.example.demo.section8.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {
        //creating LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        //using day of the year
        localDate = LocalDate.ofYearDay(2018, 355);
        System.out.println("localDate = " + localDate);

        //of
        localDate = LocalDate.of(1998, 1, 10);
        System.out.println("localDate = " + localDate);

        localDate = LocalDate.now();
        
        //get methods
        System.out.println("localDate.getMonth() = " + localDate.getMonth());
        System.out.println("localDate.getMonthValue() = " + localDate.getMonthValue());
        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
        System.out.println("localDate.get(ChronoField.DAY_OF_YEAR) = " + localDate.get(ChronoField.DAY_OF_YEAR));
    }
}

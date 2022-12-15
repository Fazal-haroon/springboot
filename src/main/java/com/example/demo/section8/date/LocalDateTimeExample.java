package com.example.demo.section8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        //of
        localDateTime = LocalDateTime.of(2022, 1, 12, 12, 25, 45);
        System.out.println("localDateTime = " + localDateTime);

        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime = " + localDateTime);
        
        //get
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMonth() = " + localDateTime.getMonth());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());
        System.out.println("localDateTime.get(ChronoField.MONTH_OF_YEAR) = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        
        //Modify
        System.out.println("localDateTime.plusYears(2) = " + localDateTime.plusYears(2));
        System.out.println("localDateTime.plusHours(4) = " + localDateTime.plusHours(4));
        System.out.println("localDateTime.plusMinutes(55) = " + localDateTime.plusMinutes(55));
        System.out.println("localDateTime.with(ChronoField.HOUR_OF_DAY, 3) = " + localDateTime.with(ChronoField.HOUR_OF_DAY, 3));
        System.out.println("localDateTime.with(LocalTime.MIDNIGHT) = " + localDateTime.with(LocalTime.MIDNIGHT));
    }
}

package com.example.demo.section8.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateModifyExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        //4 days from now
        localDate = localDate.plusDays(4);
        System.out.println("localDate = " + localDate);
        System.out.println("localDate.plusDays(4) = " + localDate.plusDays(4));
        localDate = localDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("localDate.plusMonths(2) = " + localDate.plusMonths(2));
        System.out.println("localDate.plusYears(2) = " + localDate.plusYears(2));
        System.out.println("localDate.minusDays(10) = " + localDate.minusDays(10));
        System.out.println("localDate.withYear(2024) = " + localDate.withYear(2024));
        System.out.println("localDate.with(ChronoField.YEAR, 2025) = " + localDate.with(ChronoField.YEAR, 2025));
        System.out.println("localDate.with(TemporalAdjusters.lastDayOfMonth()) = " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
    }
}

package com.example.demo.section8.date;

import java.time.*;
import java.util.Date;

public class ConvertToZoneDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println("zonedDateTime = " + zonedDateTime);

        System.out.println("localDateTime.atOffset(ZoneOffset.ofHours(-10)) = " + localDateTime.atOffset(ZoneOffset.ofHours(-10)));

        Date date = new Date();
        LocalDateTime localDateTime1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime1 = " + localDateTime1);

        java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = dateSql.toLocalDate();
        System.out.println("localDate = " + localDate);
    }
}

package com.example.demo.section8.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {
    public static void main(String[] args) {
        //Date and SimpleDateFormatter
        Date dateObj = new Date();
        System.out.println("dateObj = " + dateObj);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("dateFormat = " + dateFormat.format(dateObj));

        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("dateFormat.format(dateObj) = " + dateFormat.format(dateObj));

        dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("dateFormat.format(dateObj) = " + dateFormat.format(dateObj));

        System.out.println(Calendar.getInstance().getTime());

        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
    }
}

package com.example.demo.section8.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        System.out.println("ZonedDateTime.now(ZoneId.of(\"Asia/Hong_Kong\")) = " + ZonedDateTime.now(ZoneId.of("Asia/Hong_Kong")));
    }
}

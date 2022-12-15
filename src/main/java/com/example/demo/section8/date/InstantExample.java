package com.example.demo.section8.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("instant.getNano() = " + instant.getNano());

        Instant instant1 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(instant1, instant);
        System.out.println("duration.toSeconds() = " + duration.toSeconds());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);
    }
}

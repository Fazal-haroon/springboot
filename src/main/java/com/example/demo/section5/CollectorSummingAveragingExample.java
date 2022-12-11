package com.example.demo.section5;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {
    public static void main(String[] args) {
        //sum of years of experience of all instructor
        int sum = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExpereience));
        System.out.println("sum = " + sum);
        System.out.println("============");

        //calculate average of years of experience of all instructors
        double average = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExpereience));
        System.out.println("average = " + average);
        System.out.println("============");
    }
}

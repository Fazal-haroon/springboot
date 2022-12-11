package com.example.demo.section5;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {
    public static void main(String[] args) {
        //grouping the instructors in two sets of online course vs not online
        //and get the max years of experience of the instructors
        Map<Boolean, Optional<Instructor>> maxInstructors = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExpereience))));
        maxInstructors.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
        System.out.println("-------------");

        //collectingAndThen
        Map<Boolean, Instructor> mapInstructors1 = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing
                                (Instructor::getYearsOfExpereience)),
                        Optional::get)));
        mapInstructors1.forEach((key, value) ->
                System.out.println("key = " + key + " value = " + value));
        System.out.println("---------------");

        //average years of expereience of instructors who teaches online or not
        Map<Boolean, Double> maxInstructors2 = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.averagingInt(
                                Instructor::getYearsOfExpereience)
                ));
        maxInstructors2.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
    }
}

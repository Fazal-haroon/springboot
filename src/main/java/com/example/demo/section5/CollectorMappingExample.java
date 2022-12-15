package com.example.demo.section5;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {
    public static void main(String[] args) {
        //map
        List<String> namesList = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toList());
        namesList.forEach(System.out::println);
        System.out.println("----------------");

        //mapping
        namesList = Instructors.getAll().stream().collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        namesList.forEach(System.out::println);
        System.out.println("----------------");

        //Instructors by their years of experience
        Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream().collect(
                Collectors.groupingBy(Instructor::getYearsOfExpereience, Collectors.mapping(Instructor::getName, Collectors.toList()))
        );

        mapYearsOfExperienceAndNames.forEach((key, value) -> {
            System.out.println("experience = " + key + " name = " + value);
        });
    }
}

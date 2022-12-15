package com.example.demo.section5;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByExample {
    public static void main(String[] args) {
        //group list of name by their Length
        List<String> names = List.of("Fazal", "Haroon", "Tuts4U");
        Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("result = " + result);
        System.out.println("---------------");

        //grouping by instructors by their gender
        Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getGender));
        instructorByGender.forEach((key, value) -> {
            System.out.println("key  = " + key + " value = " + value);
        });
        System.out.println("---------------");

        //grouping by experience where >= 6 years of experience is classified
        //as Senior and others are Junior
        Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll().stream().collect(
                Collectors.groupingBy(instructor -> instructor.getYearsOfExpereience() >= 6 ? "Senior" : "Junior"));
        instructorsByExperience.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
        System.out.println("---------------");

        //grouping by length of string and also checking that the names contains e
        //and only return those name which has e in it
        List<String> name = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result2 = name.stream().collect(Collectors.groupingBy(String::length,
                Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
        System.out.println("result2 = " + result2);
        System.out.println("---------------");

        //instructor grouping them by senior >= 6 and junior <=5 and filter them
        //on online courses
        Map<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll().stream().collect(
                Collectors.groupingBy(instructor -> instructor.getYearsOfExpereience() >= 6 ? "Senior" : "Junior",
                        Collectors.filtering(s -> s.isOnlineCourses(), Collectors.toList())));
        instructorsByExperience.forEach((key, value) -> {
            System.out.println("key = " + key + " value = " + value);
        });
        System.out.println("---------------");

        LinkedHashMap<String, List<Instructor>> instructorByExpAndOnline2 = Instructors.getAll().stream().collect(Collectors.groupingBy(instructor ->
                instructor.getYearsOfExpereience() >= 6 ? "Senior" : "Junior", LinkedHashMap::new, Collectors.filtering(s -> s.isOnlineCourses(), Collectors.toList())));
        instructorByExpAndOnline2.forEach((key, value) -> {
            System.out.println("key = " + key + " value = " + value);
        });
        System.out.println("---------------");

        LinkedHashMap<Integer, List<String>> result3 = names.stream().collect(Collectors.groupingBy(String::length, LinkedHashMap::new, Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
        System.out.println("result3 = " + result3);
    }
}

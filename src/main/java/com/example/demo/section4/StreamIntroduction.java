package com.example.demo.section4;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntroduction {
    /*
    * first of all, Java 8 strams should not be confused with Java i/o stream, they have very little to do with each other
    * A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired results
    * Introduced in java 8, the stream API is used to process collection of objects
    * Java.util.Stream support map-reduce-filter transformation on collections
    *
    * The features of Stream are:
    * 1. A stream is not a data structure. It takes input from the collections, Arrays or I/O channels
    * 2. Stream does not change the original data structure from which it is constructed, it only returns the results as per the pipeline operations
    * 3. Each intermediate operation is lazily executed and return stream which can be pipelined with further operations.
    * */
    /*
    * The features of Stream are:
    * 1. Parallel operations are easy to perform with stream api without having to spawn multiple threads explicitly
    * 2. Fork join which got introduced in java 7 made it easy to perform parallel operation but stream api made it really simple
    * */
    public static void main(String[] args) {
        //creating a map of names and course of instructors who teaches
        //online have more than 10years of experience
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExpereience() > 2;

        List<Instructor> list = Instructors.getAll();
        Map<String, List<String>> map = list.stream().filter(p1.and(p2)).collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
        System.out.println(map);

        //collection vs stream
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        System.out.println("----------------------");
        System.out.println(names);

        names.remove("Syed");
        System.out.println("----------------------");
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }

        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);

        List<String> m = names.stream().filter(s -> s.startsWith("M")).collect(Collectors.toList());
        System.out.println("m = " + m);
    }
}

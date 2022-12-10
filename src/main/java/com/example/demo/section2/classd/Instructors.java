package com.example.demo.section2.classd;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor("Akash Sir", 10, "Manager", "Male", true, Arrays.asList("Java", "spring", "spring boot"));
        Instructor instructor2 = new Instructor("Vijesh Sir", 6, "Senior Java", "Male", true, Arrays.asList("Java8", "spring6", "spring boot3"));
        Instructor instructor3 = new Instructor("Fazal Sir", 3, "Java", "Male", false, Arrays.asList("Java11", "spring6+", "spring boot3+"));
        Instructor instructor4 = new Instructor("AliShah Sir", 5, "Java", "Male", true, Arrays.asList("Java11", "spring7", "spring boot3.1"));
        List<Instructor> list = Arrays.asList(instructor1, instructor2,instructor3,instructor4);
        return list;
    }
}

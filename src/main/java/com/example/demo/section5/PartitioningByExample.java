package com.example.demo.section5;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        //partition instructors in two groups of instructor
        //first is years of experience is > 6 and other is <=6
        Predicate<Instructor> experiencePredicate = instructor -> instructor.getYearsOfExpereience() > 6;
        Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll().stream().collect(Collectors.partitioningBy(experiencePredicate));
        partitionMap.forEach((key, value) -> {
            System.out.println("key = " + key + " value = " + value);
        });
        System.out.println("--------------");

        //partition but return is set instead of list
        Map<Boolean, Set<Instructor>> partitionSet = Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate, Collectors.toSet()));
        partitionSet.forEach((key, value) -> {
            System.out.println("key = " + key + " value = " + value);
        });
    }
}

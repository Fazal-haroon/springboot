package com.example.demo.section4;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.List;
import java.util.Optional;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //total years of experience b/w instructors
        int result = Instructors.getAll().stream().map(Instructor::getYearsOfExpereience).reduce(0, (a,b) -> a+b);
        System.out.println("result = " + result);
        Optional<Integer> result2 = Instructors.getAll().stream().map(Instructor::getYearsOfExpereience).reduce((a, b) -> a+b);
        System.out.println("result2 = " + result2.get());
        Optional<Integer> result3 = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).map(Instructor::getYearsOfExpereience).reduce((a, b) -> a+b);
        System.out.println("result3 = " + result3.get());
        Optional<Integer> result4 = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).map(Instructor::getYearsOfExpereience).reduce(Integer::sum);
        System.out.println("result4 = " + result4.get());

        //max using stream max function
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 11, 22, 9);
        Optional maxResult = numbers.stream().max(Integer::compareTo);
        if (maxResult.isPresent()) {
            System.out.println("maxResult = " + maxResult.get());
        }
        //(0,1) - 1
        //(1,2) - 2
        //(2,3) - 3
        int maxResult2 = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("maxResult2 = " + maxResult2);
        Optional maxResult3 = numbers.stream().reduce((a, b) -> a > b ? a : b);
        if (maxResult3.isPresent()) {
            System.out.println("maxResult3.get() = " + maxResult3.get());
        }

        Optional maxResult4 = numbers.stream().reduce(Integer::max);
        if (maxResult4.isPresent()) {
            System.out.println("maxResult4.get() = " + maxResult4.get());
        }
    }
}

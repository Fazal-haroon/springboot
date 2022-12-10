package com.example.demo.section4;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

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
    }
}

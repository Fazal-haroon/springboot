package com.example.demo.section4;

import com.example.demo.section2.classd.Instructors;

import java.util.List;
import java.util.Optional;

public class StreamReduceOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1);
        int results = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("results = " + results);
        // 0 + 1 = 1     //10 + 5 = 15     //36 + 9 = 45
        // 1 + 2 = 3     //15 + 6 = 21     //45 + 1 = 46
        // 3 + 3 = 6     //21 + 7 = 28
        // 6 + 4 = 10    //28 + 8 = 36

        int results1 = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("results1 = " + results1);

        List<Integer> numbers2 = List.of();
        Optional results3 = numbers.stream().reduce((a, b) -> a * b);
        System.out.println("results3 = " + results3.get());
        Optional results2 = numbers2.stream().reduce((a, b) -> a * b);
        if (results2.isPresent()) {
            System.out.println("results2 = " + results2.get());
        }else {
            System.out.println("NoSuchElementException");
        }

        //printing the instructor who has the highest years of experience
        Optional instructor = Instructors.getAll().stream()
                .reduce((s1, s2) -> {
                    if (s1.getYearsOfExpereience() > s2.getYearsOfExpereience())
                        return s1;
                    else
                        return s2;
                });
        if (instructor.isPresent())
            System.out.println(instructor.get());

        Optional instructor2 = Instructors.getAll().stream().reduce((instructor1, instructor21) -> instructor1.getYearsOfExpereience() > instructor21.getYearsOfExpereience() ? instructor1 : instructor21);
        if (instructor2.isPresent()) {
            System.out.println("instructor2 = " + instructor2.get());
        }
    }
}

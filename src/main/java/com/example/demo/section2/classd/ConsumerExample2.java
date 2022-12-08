package com.example.demo.section2.classd;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //looping through all the instructor and printing out the values of instructor
        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);

        System.out.println("----------------------------");

        //looping through all the instructor and only print out their name
        Consumer<Instructor> c2 = (s2) -> System.out.println(s2.getName());
        instructors.forEach(c2);

        System.out.println("----------------------------");

        //loop through all the instructor and print out their names and their courses
        Consumer<Instructor> c3 = (s3) -> System.out.println(s3.getName() + " has courses : "+ s3.getCourses());
        instructors.forEach(c3);
        //or
        Consumer<Instructor> c4 = (s2) -> System.out.print(s2.getName());
        System.out.println("----------------------------");
        Consumer<Instructor> c5 = (s2) -> System.out.println(s2.getCourses());
        instructors.forEach(c4.andThen(c5));

        System.out.println("----------------------------");

        //loop through all the instructors and print out their name if the years of experience is > 2
        instructors.forEach( inst -> {
            if (inst.getYearsOfExpereience() > 2) {
                c1.accept(inst);
            }
        });

        System.out.println("----------------------------");

        //loop through all the instructors and print out their name and years of experience if years of experience is > 2 and not teaches course online
        instructors.forEach( instrutorOnlineCourse -> {
            if(instrutorOnlineCourse.getYearsOfExpereience() > 2 && !instrutorOnlineCourse.isOnlineCourses()){
                c4.andThen(c5).accept(instrutorOnlineCourse);
            }
        });
    }
}

package com.example.demo.section2.classd;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //print out name and gender of instructors
        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("name is " + name + " and gender is " + gender);
        instructors.forEach(instructorB -> biConsumer.accept(instructorB.getName(), instructorB.getGender()));

        System.out.println("----------------------------");

        //print out name and list of courses
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out.println("name is " + name + " and courses " + courses);
        instructors.forEach(inst -> biConsumer1.accept(inst.getName(), inst.getCourses()));

        System.out.println("----------------------------");

        //print out name and gender of all instructors who teaches online
        instructors.forEach(inst -> {
            if (inst.isOnlineCourses()) {
                biConsumer.accept(inst.getName(), inst.getGender());
            }
        });

    }
}

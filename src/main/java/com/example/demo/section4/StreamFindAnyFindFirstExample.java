package com.example.demo.section4;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.Optional;

public class StreamFindAnyFindFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional = Instructors.getAll().stream().findAny();
        if (instructorOptional.isPresent()) {
            System.out.println("instructorOptional.get() = " + instructorOptional.get());
        }
        
        instructorOptional = Instructors.getAll().stream().findFirst();
        if (instructorOptional.isPresent()) {
            System.out.println("instructorOptional.get() = " + instructorOptional.get());
        }
    }
}

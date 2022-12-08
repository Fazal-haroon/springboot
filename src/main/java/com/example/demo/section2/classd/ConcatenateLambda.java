package com.example.demo.section2.classd;

import com.example.demo.section2.interfaced.ConcatenateInterface;

public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (x, y) -> {
            return x + " " + y;
        };
        System.out.println(concatenateInterface.sconcate("hello", "Java 8"));
    }
}

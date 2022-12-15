package com.example.demo.section1.classd;

import com.example.demo.section1.interfaced.IncrementByFiveInterface;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = (x) -> x + 5;
        System.out.println("incrementByFiveInterface.incrementByFive(6) = " + incrementByFiveInterface.incrementByFive(6));
    }
}

package com.example.demo.section1.classd;

import com.example.demo.section1.interfaced.IncrementByFiveInterface;

public class IncrementByFiveTraditional implements IncrementByFiveInterface {
    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println("incrementByFiveTraditional.incrementByFive(6) = " + incrementByFiveTraditional.incrementByFive(6));
    }
}

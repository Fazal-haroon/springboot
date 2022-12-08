package com.example.demo.section1.classd;

import com.example.demo.section1.interfaced.ConcatenateInterface;

public class ConcatenateTraditional implements ConcatenateInterface {
    @Override
    public String sconcate(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        ConcatenateTraditional concatenateTraditional = new ConcatenateTraditional();
        String sconcate = concatenateTraditional.sconcate("Hello", "Java");
        System.out.println("concatenateTraditional.sconcate() = " + sconcate);
    }
}

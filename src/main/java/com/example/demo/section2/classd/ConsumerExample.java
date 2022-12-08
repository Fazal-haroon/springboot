package com.example.demo.section2.classd;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.length() + " the value of x: " + x);
        c.accept("Learning Stage");

        //Consumer with block statement
        Consumer<Integer> d = (x) -> {
            System.out.println("x*x = " + x * x);
            System.out.println("x/x = " + x / x);
        };
        d.accept(10);
    }
}

package com.example.demo.section2.classd;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        //printing two numbers
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x: " + x + " y:" + y);
        biConsumer.accept(2, 5);

        //calculating sum of two integers
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("x plus y : " + (x + y));
        biConsumer1.accept(2,3);

        //concatenate strings
        BiConsumer<String, String> biConsumer2 = (x, y) -> System.out.println(x + " " + y);
        biConsumer2.accept("Java", "world");

        //difference between Consumer and BiConsumer is only, BiConsumer takes two arguments and consumer only take one argument
    }
}

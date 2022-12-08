package com.example.demo.section2.classd;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        IntConsumer intConsumer = (x) -> System.out.println(x * 10);
        intConsumer.accept(10);

        LongConsumer longConsumer = (x) -> System.out.println(x * 10L);
        longConsumer.accept(10L);

        DoubleConsumer doubleConsumer = (x) -> System.out.println(x * 10);
        doubleConsumer.accept(10.52);
    }
}

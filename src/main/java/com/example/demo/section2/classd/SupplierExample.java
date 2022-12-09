package com.example.demo.section2.classd;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
        System.out.println("supplier = " + supplier.get());
        System.out.println("supplier.get() = " + supplier.get());
    }
}

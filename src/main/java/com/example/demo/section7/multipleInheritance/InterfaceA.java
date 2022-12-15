package com.example.demo.section7.multipleInheritance;

public interface InterfaceA {
    default void sumA(int num1, int num2){
        System.out.println("InterfaceA.sumA = " + (num1+num2));
    }
}

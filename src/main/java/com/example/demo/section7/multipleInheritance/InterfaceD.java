package com.example.demo.section7.multipleInheritance;

public interface InterfaceD {
    default void sumA(int num1, int num2){
        System.out.println("InterfaceD.sumA = " + (num1+num2));
    }
}

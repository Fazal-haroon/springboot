package com.example.demo.section7.multipleInheritance;

public class MultipleInheritanceDebuggingExample implements InterfaceA, InterfaceD{
    @Override
    public void sumA(int num1, int num2) {
        InterfaceA.super.sumA(num1, num2);
        InterfaceD.super.sumA(num1, num2);
        System.out.println("MultipleInheritanceDebuggingExample.sumA = " + (num1 + num2));
    }

    public static void main(String[] args) {
        MultipleInheritanceDebuggingExample multipleInheritanceDebuggingExample = new MultipleInheritanceDebuggingExample();
        multipleInheritanceDebuggingExample.sumA(2,3);
    }
}

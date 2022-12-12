package com.example.demo.section7;

public class CalculatorImplExample implements Calculator {

    public static void main(String[] args) {
        CalculatorImplExample calculatorImplExample = new CalculatorImplExample();
        System.out.println("calculatorImplExample.sum(2,3) = " + calculatorImplExample.sum(2,3));
        System.out.println("calculatorImplExample.divide(6,2) = " + calculatorImplExample.divide(6,2));
        //Our implementation using Lambda expression for sum and divide
//        Calculator calculator = (num1, num2) -> num1 + num2;
        //there Calculator is confused b/c there is no @functionalInterface where only one abstract method, there is 2 abstract method which create ambiguous
        System.out.println("calculatorImplExample.subtract(4,2) = " + calculatorImplExample.subtract(4,2));
        System.out.println("Calculator.multiply(2,4) = " + Calculator.multiply(2,4));
    }

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}

package com.example.demo.section7.multipleInheritance;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {
    public static void main(String[] args) {
        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();
        multipleInheritanceExample.sumA(2,5);
        multipleInheritanceExample.sumB(4, 5);
        multipleInheritanceExample.sumC(2,3);
        multipleInheritanceExample.sumA(2,5);
    }

    public void sumA(int num1, int num2){
        System.out.println("MultipleInheritanceExample.sumA = " + (num1+num2));
    }
}

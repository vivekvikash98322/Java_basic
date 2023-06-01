package com.java.basic.Lambda.FunctionalInterface;


public class FunctionalInterfaceAsRef {
    
    public static void main(String[] args) {
        
        MyInterface interface1 = (int number) -> System.out.println(number); 

        methodref(interface1);
    }


    public static void methodref(MyInterface interface1) {
        interface1.febonacciSeries(10);
    }
}

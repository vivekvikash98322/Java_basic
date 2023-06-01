package com.java.basic.Lambda.MethodReference;

public class ConstructorFunctionalInterfaceExample {
    
    String s;
    ConstructorFunctionalInterfaceExample(String s){
        this.s  = s;
    }

    public static void main(String[] args) {
        ConstructorFunctionalInterface methodReference = ConstructorFunctionalInterfaceExample::new;

        methodReference.reverse("hello");
    }
}

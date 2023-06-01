package com.java.basic.Lambda.MethodReference;

public class ObjectMethodReferenceMain {
    
    public static class StaticClass {

        public String reverse(String value) {
            String finalValue  = "";
            for (char string : value.toCharArray()) {
                finalValue  = string + finalValue;
            }

            return finalValue;
        }
    }

    public static void main(String[] args) {

        StaticClass class1 = new StaticClass();
        StaticMethodReference functionaInterface = class1::reverse;

        System.out.println(functionaInterface.reverse("Hello this is my world"));
    }

}

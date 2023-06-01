package com.java.basic.Lambda.MethodReference;

public class StaticMethodRefMain {

    public class StaticClass {

        public static String reverse(String value) {
            String finalValue  = "";
            for (char string : value.toCharArray()) {
                finalValue  = string + finalValue;
            }

            return finalValue;
        }
    }
    
    public static void main(String[] args) {
        StaticMethodReference functionaInterface = StaticClass::reverse;

        System.out.println(functionaInterface.reverse("Hello this is my world"));
    }
}

package com.java.basic.Lambda.FunctionalInterface;

import lombok.val;

public class GenericFunctionalInterfaceMain {
    
    public static void main(String[] args) {
        
        GenericFunctionaInterface<String, String> functionaInterface = (String value ) -> {

            String finalValue  = "";
            for (char string : value.toCharArray()) {
                finalValue  = string + finalValue;
            }

            return finalValue;
        };

        System.out.println(functionaInterface.reverse("Hello this is my world"));
    }
}

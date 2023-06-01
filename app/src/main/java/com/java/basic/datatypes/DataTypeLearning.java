package com.java.basic.datatypes;

public class DataTypeLearning {
    
    public static void main(String[] args) {
        int varibale = 88;

        System.out.println(varibale);

        char charVariable = (char)varibale;


        System.out.println(charVariable);

        //We can perform arithmatic operation on char as its stores ASCII VALUE.
        System.out.println(charVariable + charVariable);


        /**
         * We have new data type called Var which is basically local variable inference
         * use to infer data type by looking at initializer ex
         */

         var i = "String";

         System.out.println(i);
    }
}

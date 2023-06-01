package com.java.basic.stringExample;

public class StringExamples {

    public static void main(String[] args) {

        /**
         * String literal not always create new string and passing memory
         * it basically checks whether same string exists or not if not
         * then create new one otherwise just return the ref of same.
         */

        String  example = "Hello World";

        String example2 = "Hello World";

        System.out.println(Integer.toString(example.hashCode()).equals(example2.hashCode()+""));

        /**
         * Another example of the same when string in created usign string literal.
         */

         String example3 = "Hello";

         example3 += " World";

         System.out.println("This is compare " + Integer.toString(example.hashCode()).equals(example3.hashCode() + ""));
    }
}

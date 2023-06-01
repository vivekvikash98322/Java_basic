package com.java.basic.ExceptionHandling;

public class ExceptionHandling_1 {
    
    /**
     * This program tells you about try catch block.
     * @param args
     */
    public static void main(String[] args) {
        
        int i = 0;
        int y = 10;
        int z = 0;
        try {
            z = y / i;
        }catch(ArithmeticException arithmeticException){
            System.out.println("Catch block exicuted");
        }

        System.out.println("Hey here is value :" + z);
    }
}

package com.java.basic.ExceptionHandling;

import java.io.IOException;

public class ExceptionHandling_2 {
    

    /**
     * This example shows you of try with multi catch block.
     * @param args
     */
    public static void main(String[] args) {
        
        int i = 0;
        int y = 10;
        int z = 0;
        try {
            z = y / i;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Catch block ArrayIndexOutOfBoundsException");
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("Catch block ArithmeticException");
        }
        catch(Exception arithmeticException){
            System.out.println("Catch block Exception");
        }

        System.out.println("Hey here is value :" + z);
    }
}

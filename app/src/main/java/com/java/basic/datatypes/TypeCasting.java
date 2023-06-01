package com.java.basic.datatypes;

public class TypeCasting {
    
    /**
     * There is two type of type casting as follow.
     * 1. Automatic : If we try to cast samller variable to large variable its dosnt requre casting.
     * 2. Implicit casting: If we havr to cast the variable to smaller data type. this is also called as narrowing.
     * @param args
     */
    public static void main(String[] args) {
        
        short i = 64;
        
        int y = i << 2;// IT dsont give us any error as it auto cast to int
        System.out.println(y);

        i = (short)y;//Explicitly casting to t to short it may cause data loose.
    }
}

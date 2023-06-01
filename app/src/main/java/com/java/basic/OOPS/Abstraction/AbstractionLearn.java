package com.java.basic.OOPS.Abstraction;

public class AbstractionLearn {
    
    public static void main(String[] args) {
        
        Volume volume= new Cube(4);
        Volume volume2 = new Rectangle(2, 3, 4);

        System.out.println(volume.calc());
        System.out.println(volume2.calc());
    }
}

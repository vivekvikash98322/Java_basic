package com.java.basic.OOPS.Pollymorphism;

public class Area {


    Area(double type){
        System.out.println("Help");
    }

    Area(int value){
        this(20.0);
        System.out.println("Help 1");        
    }
    
    /**
     * This will calc area of rectangle.
     */
    public double area (int length, double width){
        return length * width;
    }

    /**
     * This will crrate area of circule.
     * @param radius
     * @return
     */
    public double area (double radius){
        return 3.14 * (radius * radius);
    }
}

package com.java.basic.OOPS.Abstraction;

public class Cube extends Volume{
    
    final double a;


    Cube(double a){
        this.a = a;
    }

    @Override
    public double calc() {
       return a * a * a;
    }

}

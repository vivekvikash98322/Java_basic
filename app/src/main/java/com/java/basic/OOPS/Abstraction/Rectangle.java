package com.java.basic.OOPS.Abstraction;

public class Rectangle extends Volume {

    final double length;
    final double width;
    final double height;


    Rectangle(double length, double width, double height){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calc() {
       return length * width * height;
    }
    
}

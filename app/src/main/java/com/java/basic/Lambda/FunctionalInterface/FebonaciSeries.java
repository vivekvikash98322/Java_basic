package com.java.basic.Lambda.FunctionalInterface;



public class FebonaciSeries {
    
    public static void main(String[] args) {
        FebonaciSeries febonaciSeries = new FebonaciSeries();
        System.out.println(0);
        febonaciSeries.calc(0, 1, 10);
    }


    public void calc(int first, int second, int number) {

        if(number  == 0) return;

        System.out.println(first+ second);
        calc(second, first+ second, number - 1);
    }
}

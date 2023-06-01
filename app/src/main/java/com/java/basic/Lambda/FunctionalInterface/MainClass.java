package com.java.basic.Lambda.FunctionalInterface;

public class MainClass {
    
    /**  2*i + 1
     * 0 1 1 2 3 5 8 13
     * @param args
     */
    public static void main(String[] args) {
         MyInterface interface1 = (int number) -> {
            if(number == 0 ) return;

            int first = 0;
            int second = 1;
            System.out.print(first + " " + second + " ");
            for (int i = 1; i < number ; i++) {
                System.out.print(first + second);
                int temp = first + second;
                first = second;
                second = temp;
                System.out.print(" ");
            }
        };

        interface1.febonacciSeries(10);
    }
}

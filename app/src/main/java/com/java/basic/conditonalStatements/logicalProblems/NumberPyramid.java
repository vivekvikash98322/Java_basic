package com.java.basic.conditonalStatements.logicalProblems;

public class NumberPyramid {
    
    public static void main(String[] args) {
        
        int height = 5;

        var array  = new int [2*height - 1];


        for (int i = 0, space = height; i < height; i++, space--) {
            int threasold = 0;
            
            for (int j = 0; j < space; j++) {
                threasold++;
                System.out.print(" ");
            }

            for (int j = 0, k = i; j < 2*i + 1; j++) {

                if(i != 0 && threasold > height){
                    System.out.print(--k);
                    continue;
                }
                threasold++;                
                System.out.print(++k);
            }

            System.out.println();
        }
    }

}

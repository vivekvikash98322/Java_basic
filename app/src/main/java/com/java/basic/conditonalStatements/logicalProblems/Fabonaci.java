package com.java.basic.conditonalStatements.logicalProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fabonaci {
    

    public static void main(String[] args) {
        int number = 10;
        List<Integer> array = new ArrayList<>(Arrays.asList(0, 1));
        
        for (int i = 2; i < number; i++) {
            array.add(Integer.valueOf((array.get(i - 1) + array.get(i - 2))));
        }


        array.stream().forEach(elemenet -> System.out.print(elemenet + " "));
    }
}

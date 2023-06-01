package com.java.basic.OOPS.InterfaceLearn;

import java.util.List;

public interface DataStorage {

    String FIRST = "10";
    String SECOND = "20";
    String THIRD = "30";

    boolean add(Integer integer);

    List<Integer> getAll();

    default void remove(Integer integer){
        List<Integer> integers = getAll();
        integers.remove(integer);
        PrintAll(integers);
    }

    static void printAll(List<Integer> integers){
        integers.stream().forEach(arg0 -> System.out.println(arg0));
    }


    private void PrintAll(List<Integer> integers){
        printAll(integers);
    }
}

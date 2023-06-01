package com.java.basic.OOPS.InterfaceLearn;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDataStorage implements DataStorage {

    private final static List<Integer> dataStorage = new LinkedList<Integer>();

    @Override
    public boolean add(Integer integer) {
       dataStorage.add(integer);
       return true;
    }

    @Override
    public List<Integer> getAll() {
        return dataStorage;
    }
    

    @Override
    public void remove(Integer integer) {
        dataStorage.remove(integer);
    }

}
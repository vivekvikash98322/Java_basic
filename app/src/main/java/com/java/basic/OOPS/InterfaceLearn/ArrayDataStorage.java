package com.java.basic.OOPS.InterfaceLearn;

import java.util.ArrayList;
import java.util.List;

public class ArrayDataStorage implements DataStorage {

    private final static List<Integer> dataStorage = new ArrayList<Integer>();

    @Override
    public boolean add(Integer integer) {
       dataStorage.add(integer);
       return true;
    }

    @Override
    public List<Integer> getAll() {
        return dataStorage;
    }
    
}

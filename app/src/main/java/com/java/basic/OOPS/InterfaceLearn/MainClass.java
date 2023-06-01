package com.java.basic.OOPS.InterfaceLearn;

public class MainClass {
    

    public static void main(String[] args) {
        
        DataStorage dataStorage= new ArrayDataStorage();
        DataStorage dataStorage2 = new LinkedListDataStorage();

        dataStorage.add(1);
        dataStorage.add(2);
        dataStorage.add(3);
        dataStorage.add(4);


        dataStorage2.add(1);
        dataStorage2.add(2);
        dataStorage2.add(3);
        dataStorage2.add(4);
    
        dataStorage.remove(3);

        // dataStorage2.remove(3);
        
    }
}

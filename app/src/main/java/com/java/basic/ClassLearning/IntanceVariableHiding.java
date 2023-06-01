package com.java.basic.ClassLearning;

public class IntanceVariableHiding {


 public class LocalClass {
    
    int number = 10;

    public int calc(){
        //This variable is gonna hide the global scope variable.
        int number = 20;

        return number;
    }
 }
    

    public static void main(String[] args) {
        IntanceVariableHiding hiding_1 = new IntanceVariableHiding();
        LocalClass class1 = hiding_1.new LocalClass();
        System.out.println(class1.calc());
    }
}

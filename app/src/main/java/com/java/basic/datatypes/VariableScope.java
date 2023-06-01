package com.java.basic.datatypes;

public class VariableScope {
    
    public static void main(String[] args) {
        
        //Glopbal scope
        int i = 10;

        if(true){
            //Local scope
            int y = 20;
            System.out.println(i + " " + y);
        }

        //Can not access y since this belong to local scope and the variable is not accesible.
        //System.out.println(i + " " + y);

    }
}

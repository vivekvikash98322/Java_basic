package com.java.basic.conditonalStatements.logicalProblems;

import java.util.Scanner;

public class Star {
    

    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Please enter number ");
        int hight = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0, space = hight ; i < hight; i++, space--) {
            
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i + 1; j++) {
                System.out.print('*');
            }

            System.out.println();
        }

        scanner.close();         
    }
}

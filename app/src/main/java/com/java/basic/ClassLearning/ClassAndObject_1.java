package com.java.basic.ClassLearning;

public class ClassAndObject_1 {
    

    public static void main(String[] args) {
        
        Employee employee = new Employee(1, 30000.00);
        Employee employee2 = new Employee(1, 30000.00);

        System.out.println(employee+ " " +  employee2);
        employee.setId(3);
        System.out.println(employee+ " " +  employee2);

        Employee employee3 = new Employee(1, 30000.00);
        Employee employee4 = employee3;

        System.out.println(employee3 + " " +  employee4);
        
        employee3.setId(5);
        System.out.println(employee3+ " " +  employee4);
    }
}

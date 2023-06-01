package com.java.basic.ClassLearning;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
    
    private Integer id;

    private Double salary;

    {
        System.out.println("This is non static block");
    }

    static {
        System.out.println("This is static block");
    }

    Employee(Integer id, Double salary) {
        
        System.err.println("Constructor is called!!!");
        this.id = id;
        this.salary = salary;
    }
}

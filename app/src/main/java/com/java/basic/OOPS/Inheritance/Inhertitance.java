package com.java.basic.OOPS.Inheritance;

public class Inhertitance {

    public static void main(String[] args) {

        LivingBeing livingbeing = new LivingBeing();
        Human human = new Human();
        Animal animal = new Animal();

        livingbeing.speak(); 
        livingbeing.walk();
        animal.speak();
        animal.walk();
        human.walk();
        human.speak();

        System.out.println("------------------------------------------------------------------");

        LivingBeing being = human;
        System.out.println(being.value);
        being.speak(); 
        being.walk();


        System.out.println("_________Rules______________________________");

        
    }
}

package com.example.abstraction;

public abstract class Dog extends Animal {
    public Dog() {
        super("Oreo","White");
        System.out.println("default constructor of Dog");
    }
    public String eat() {
        return "I eat Biscuits";
    }
    public abstract String sound();
    public abstract String sleep();
}

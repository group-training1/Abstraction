package com.example.abstraction;

public abstract class Animal {
    public Animal() {
        System.out.println("default constructor of Animal");
    }
    public Animal(String name, String Color) {
        System.out.println("para construct of Animal");
    }
    public abstract String eat();
    public abstract String sound();
    public abstract String sleep();


}

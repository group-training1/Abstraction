package com.example.abstraction;

public class Pomeranian extends Dog {
    public Pomeranian() {
        System.out.println("default constructor of Pomeraninan");
    }

    @Override
    public String sound() {
        return "Bow Bow";
    }

    @Override
    public String sleep() {
        return "zzz";
    }
}




package com.example.corejavademo.facatorypattern;

public class Hp implements Laptop {
    public Hp() {
    }

    @Override
    public void specs() {
        System.out.println("I'm using Hp laptop.");
    }
}

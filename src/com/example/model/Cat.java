package com.example.model;

public class Cat extends  Animal{
    @Override
    public void makeSound() {
        System.out.println ("Wowow");
    }

    public Cat(int age) {
        super ( age );
    }
}

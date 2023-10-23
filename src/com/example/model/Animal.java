package com.example.model;

public class Animal {
    private int age;
    public void makeSound(){
        System.out.println ("Hell yeah");
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}

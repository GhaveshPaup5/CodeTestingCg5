package com.example.firsttest;

import com.example.model.Animal;
import com.example.model.Cat;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void justMakingSound(Animal animal){
        animal.makeSound ();
    }

    public static void justMakingSound2(Cat animal){
        animal.makeSound ();
    }
    public static void main(String[] args) {
       Animal animal = new Cat();
       Cat cat  = new Cat ();

       justMakingSound ( animal );
       justMakingSound2(cat);




    }
}

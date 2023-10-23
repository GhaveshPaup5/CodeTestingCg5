package com.firsttest;

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
       Animal animal = new Cat(50);
       Cat cat  = new Cat (55);
       animal.setAge ( 60 );
       System.out.println (animal);

       justMakingSound ( animal );
       justMakingSound2(cat);




    }
}

package com.example3;

public class Main {
    public static  void main(String args[]){
        Shape cercle = new Circle ( 5.5 );
        System.out.println ( cercle.getPerimeter ());
        Shape shape = new Shape ();
        System.out.println (shape.getPerimeter ());
        Shape shape1 = new Shape ();
        Circle c2 = (Circle) shape1;

    }
}

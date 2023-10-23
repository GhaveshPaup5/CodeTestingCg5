package com.example3;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI*this.radius*this.radius);
    }

    @Override
    public double getPerimeter(){
        return  (2*this.radius*Math.PI) ;
    }

    public void justeIci(){


    }



}

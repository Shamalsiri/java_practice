package com.shamal.test;

public class Square extends Shape{

    double length;

    // Requires constructors that contains the Parameters of the super class. String in this case
    //But can have additional parameters too
    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    double area() {
        return Math.pow(length,2);
    }

    @Override
    String info() {
        return "A " + super.color + " Square with a area of: " + area();
    }
}

package com.shamal.test;

public class Circle extends Shape{

    double radius;

    // Requires constructors that contains the Parameters of the super class. String in this case
    //But can have additional parameters too
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    String info() {
        return "A " + super.color + " Circle with a area of: " + area();
    }
}

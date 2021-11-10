package com.shamal.test;


public class CircleI implements ShapeI {

    String color;
    double radius;

    public CircleI(String color, double radius)
    {
        this.color = color;
        this.radius = radius;
    }
    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String info() {
            return "A " + color() + " Circle with a area of: " + area();
    }

}

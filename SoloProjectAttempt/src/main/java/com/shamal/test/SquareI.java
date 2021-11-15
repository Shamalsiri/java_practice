package com.shamal.test;

public class SquareI implements ShapeI {

    String color;
    double length;

    public SquareI(String color, double length)
    {
        this.color = color;
        this.length = length;
    }
    @Override
    public String color() {
        return this.color;
    }

    @Override
    public double area() {
        return Math.pow(length,2);
    }

    @Override
    public String info() {
        return "A " + color() + " Square with a area of: " + area();
    }
}

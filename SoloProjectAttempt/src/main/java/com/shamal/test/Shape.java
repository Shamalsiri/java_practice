package com.shamal.test;

abstract class Shape {
    String color;

    public Shape (String color)
    {
        this.color =  color;
    }

    // Abstract classes can have both abstract and regular methods
    abstract double area();
    abstract String info();


    // Abstract classes can have both abstract and regular methods
    public String getColor()
    {
        return color;
    }
}

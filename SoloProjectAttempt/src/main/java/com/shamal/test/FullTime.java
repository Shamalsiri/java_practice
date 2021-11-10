package com.shamal.test;

public class FullTime extends Employee{

    @Override
    int salary ()
    {
        return base+20000;
    }

    void myMethod()
    {
        System.out.println("My method is only in the Full Time Class");
    }

    static String Designation()
    {
        return "Designation: Full Time";
    }
}

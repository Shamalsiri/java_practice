package com.shamal.test;

public class Contractor extends Employee {

    @Override
    int salary()
    {
        return base + 10000;
    }

    static String Designation()
    {
        return "Designation: Contractor";
    }
}

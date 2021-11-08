package com.shamal.test;

public class MySuperClass {
    String superClassStr = "This is the super class global variable string";
    String commonstr = "Superclass class common String";
    public MySuperClass(String ParamStr)
    {
        System.out.println("This is the super-class constructor");
        System.out.println(ParamStr);
    }

    public void commonMethod()
    {
        System.out.println("Live from the super common method");
    }
    public void superclassMethod(){
        System.out.println("This is the String inside the superClass!");
    }
}

package com.shamal.test;

public class MySubClass extends MySuperClass{

    String commonstr = "Sub class common String";
    public MySubClass(String constructorStr)
    {
        super(constructorStr);
        System.out.println("This is the sub-class constructor");
    }

    public void printCommonStr()
    {
        System.out.println(commonstr);
        System.out.println(super.commonstr);
    }

    public void commonMethod()
    {
        System.out.println("Live from the sub common method");
    }

    public void printCommonMethod()
    {
        commonMethod();
        super.commonMethod();
    }
}

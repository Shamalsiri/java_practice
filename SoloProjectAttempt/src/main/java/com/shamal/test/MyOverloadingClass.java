package com.shamal.test;

public class MyOverloadingClass {

    void myMethod(String str)
    {
        System.out.println(str);
    }

    void myMethod(String str, int i)
    {
        System.out.println(str + i);
    }

    void myMethod(int i)
    {
        System.out.println(i);
    }
}

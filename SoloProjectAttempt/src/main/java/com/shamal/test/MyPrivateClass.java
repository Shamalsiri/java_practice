package com.shamal.test;

public class MyPrivateClass {
    private String str = "My Str";

    public void myMethod(){
        System.out.println("This is my method in the MyPrivateClass");
    }

    public String getStr()
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str=str;
    }
}

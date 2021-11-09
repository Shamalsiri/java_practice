package com.shamal.test;

public class MyPrivateClass {
    private String str = "My Str";

    public void myMethod(){
        System.out.println("This is my method in the MyPrivateClass");
    }

    public String getStr() //If you'd like it to be write only, then set getStr to private and set setStr to public
    {
        return str;
    }

    public void setStr(String str) //If you'd like it to be write only, then set getStr to private and set setStr to public
    {
        this.str=str;
    }

    public void printString() // Used if the class is a write only class
    {
        System.out.println(str);
    }
}

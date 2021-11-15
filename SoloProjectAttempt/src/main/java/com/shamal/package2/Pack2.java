package com.shamal.package2;

public class Pack2 extends Pack21 {
    public String pack2Str = "Public Package2 String";
    protected String pack2Str1 = "Protected Package2 String";

    public void pack2Method(){
        System.out.println("This is the Public Package2 Method");
    }

    protected void pack2Method1()
    {
        System.out.println("This is the protected Package 2 method");
    }

}

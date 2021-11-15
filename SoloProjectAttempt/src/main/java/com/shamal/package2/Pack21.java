package com.shamal.package2;

public class Pack21 {
    public void myMethod(){
        Pack2 pack = new Pack2();
        System.out.println(pack.pack2Str1); //can access the string in Pack2 because of protected modifier
        pack.pack2Method1(); //can access the method in Pack2 because of protected modifier
    }

}

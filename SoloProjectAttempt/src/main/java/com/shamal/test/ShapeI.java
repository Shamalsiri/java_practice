package com.shamal.test;

 interface ShapeI {
     int i = 5; //by default this is a final variable, so needs to be defined

     String color();
     double area();
     String info();


     //Note Interface can also contain the defined methods
     static void staticMethod()
     {
         System.out.println("static Method in Interface");
     }
}

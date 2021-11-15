package com.shamal.test;

import com.shamal.package2.Pack2;

import java.io.*;
import java.text.FieldPosition;

public class MyClass{

    //static int - Global Variable
    static int i;
    int j;


    //Default Constructor
    public MyClass()
    {

    }

    //main method
    public static void main (String[] args)
    {

//        getStaticVar();
//        callMethodOutsideClass();
//        Calculations.addFive(6);
//        System.out.println(usingEnums());
//        callingSuperClass();
//        callingPackage2();
//        encapsulation();
//        polymorphism();
//        callingAbstractClasses();
//        callingAbstractInterface();
        exceptionHandling();
    }

    // This method introduces and explains how the static key word works
    // We will be using the static global variable i & global variable j on this example
    public static void getStaticVar()
    {
        // create 1st object
        // print default i and j values
        MyClass myObject = new MyClass();
        System.out.println("1. i:" + myObject.i);
        System.out.println("1. j:" + myObject.j);
        System.out.println();

        // create 2nd object
        // print default i and j values
        MyClass myObject1 = new MyClass();
        System.out.println("2. i:" + myObject1.i);
        System.out.println("2. j:" + myObject1.j);
        System.out.println();

        // Assign i a value of 10
        // Print i and j values for both objects
        i = 10;
        System.out.println("1. i:" + myObject.i);
        System.out.println("1. j:" + myObject.j);
        System.out.println("2. i:" + myObject1.i);
        System.out.println("2. j:" + myObject1.j);
        System.out.println();

        //set 1st object.j value to 4
        //set 2nd object.j value to 10
        //set 1st object.i value to 5
        //set 2nd object.i value to 20
        myObject.j = 4;
        myObject1.j = 10;
        myObject.i = 5;
        myObject1.i = 20;

        //Following code shows how NON Static variables hold values
        //The j values (non static) for both objects will print the assigned value
        //The i values (static) will only print the j value assigned the latest.
             // even though myObject i value is set to 5, since i is static, it will change the i
             // value for myObject when the i value of myObject1 is changed.
        System.out.println("1. i:" + myObject.i);
        System.out.println("2. i:" + myObject1.i);
        System.out.println("1. j:" + myObject.j);
        System.out.println("2. j:" + myObject1.j);
        System.out.println();

    }

    // This method classes objects and methods from other classes in the package
    // Note: an object of the class you are calling need to be initialized to call the
    //methods
    private static void callMethodOutsideClass()
    {

        // First way
        // Non static method in Calculation class
        // need to instantiate class that contains the method that you want to call
        MyClass myObject = new MyClass();
        Calculations myCalc = new Calculations();
        System.out.println(myCalc.add5(myObject.j));


        //Second way
        // Static method in Calculation class
        // no need to instantiate a object from class with method.
        // still need to instantiate the class that contains var j
        // for this example myObject is already instantiated.
        System.out.println(Calculations.addFive(myObject.j));



    }

    // Using ENUMs on a switch statements for Control Structures
    // ENUMS are defined in Flags.java file
    private static boolean usingEnums()
    {
        switch(Flags.RED)
        {
            case GREEN:
                System.out.println("Its a Green Flag!");
                return false;
            case YELLOW:
                System.out.println("Its a Yellow Flag!");
                return false;
            case RED:
                System.out.println("Its a RED Flag!");
                return true;
            default:
                return false;
        }
    }

    // This method shows the use of Inheritance and the super keyword
    // The super and subclasses are related to this
    private static void callingSuperClass()
    {

        // Since the subclass extends the superclass
        // The subclass objects can call global variables and methods on the Superclass
        System.out.println("\n--Instantiating a subClass Object: ");
        MySubClass subClass = new MySubClass("Constructor str");

        System.out.println("\n--Printing superclass string: ");
        System.out.println(subClass.superClassStr);

        System.out.println("\n--Calling superclass method: ");
        subClass.superclassMethod();

        System.out.println("\n--Printing common str: ");
        subClass.printCommonStr();

        System.out.println("\n--Printing common method: ");
        subClass.printCommonMethod();


    }

    // This method shows what it's like to call classes from other packages
    // If looked into the classes in Package 2, ACCESS MODIFIERS are used.
    private static void callingPackage2()
    {
        Pack2 pack2 = new Pack2();
        System.out.println(pack2.pack2Str);
        pack2.pack2Method();
        //pack2.pack2Str1;  // Can't access pack2Str1 outside the package because it's protected.
        pack2.myMethod(); // Can access myMethod because it's public
    }

    //This method shows example of encapsulation
    // Encapsulation is the use of get and set methods and also using access modifiers for security of the program
    private static void encapsulation()
    {
        System.out.println("\nUse of Encapsulation\n");
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        myPrivateClass.myMethod();
        myPrivateClass.printString();
        myPrivateClass.setStr("I'm setting the string here");
        System.out.println(myPrivateClass.getStr());

    }
    //This method shows the use of polymorphism
    //it is used with classes that shows an "is a" relationship
    // This method also shows the use of overloading methods as well
    private static void polymorphism()
    {

        System.out.println("\nUse of Polymorphism\n");
        Employee e = new Employee();
        System.out.println("Employee Salary: " + e.salary());

        //Because FullTime Class extends employee, there is an "Is A" relationship between the 2 classes
        // FullTime is an Employee
        e = new FullTime();
        System.out.println("FullTime Salary: " + e.salary() );

        // Can't call e.myMethod() from the FullTime class because e is Reference Variable of type Employee
        // and Employee Class doesn't contain a myMethod() method.
        // Therefore, in order to class myMethod in the FullTime class, A FullTime reference variable is needed
        FullTime f = new FullTime();
        f.myMethod();

        //Contractor "is a" Employee
        e = new Contractor();
        System.out.println("Contractor Salary: " + e.salary());


        System.out.println("\nUsing Overridden methods\n");
        //Static methods can't be overridden, but they can have the same method name
        //Static methods are called using the class name
        System.out.println(Employee.Designation());
        System.out.println(FullTime.Designation());
        System.out.println(Contractor.Designation());


        System.out.println("\nUsing Overloaded Methods\n");
        //Overloaded methods contain the same method name but the parameters are different.
        MyOverloadingClass molc = new MyOverloadingClass();
        molc.myMethod("Just a string here");
        molc.myMethod("String and a int", 5);
        molc.myMethod(55);
    }

    // This method contains examples of using abstract classes and abstract methods
    private static void callingAbstractClasses()
    {
        Shape s = new Circle("Red", 5);
        System.out.println(s.info());

        s = new Square("Blue", 10);
        System.out.println(s.info());
    }

    // This method shows the use of abstract interfaces
    // Note, static methods can be called directly
    private static void callingAbstractInterface()
    {
        ShapeI c = new CircleI("Red", 2);
        System.out.println(c.info());

        ShapeI s = new SquareI("Blue", 5);
        System.out.println(s.info());

        ShapeI.staticMethod();
        System.out.println("The global variable in the Interface: " + ShapeI.i);
    }

    // There are 2 types of exception handling methods
    // 1. Try-Catch block
    // 2. Method throws exception
    private static void exceptionHandling() {

        /*//Example of Exception
        int array[]= {1,2,3};
        System.out.println(array[3]);*/
        System.out.println("\nUsing Try- Catch Blocks\n");
        usingTryCatchBlocks();
        System.out.println("\n Throw exception \n");
        try {
            throwException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\n Try-Catch + Throw Exception \n");
        try {
            tryCatchAndThrowExceptions();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Example of a try-catch block to handle exception
    // Note: sys.out line did run this time
    private static void usingTryCatchBlocks()
    {
        File file = new File("c://trycatch.txt");
        try {
            FileReader fw = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Prints after the exception");

    }

    // Example of throwing an exception
    // Note the sys.out line didn't run
    // Note program exit with code 0
    private static void throwException() throws FileNotFoundException {
        File file = new File("c://throw.txt");
        FileReader fw = new FileReader(file);
        System.out.println("Prints after the exception");
    }

    // Example of using both Try Catch and throwing exception
    // Note the sys.out line didn't run
    // Note program exit with code 0
    private static void tryCatchAndThrowExceptions() throws FileNotFoundException {
        File file = new File("c://tryCatchAndThrow.txt");
        try {
            FileReader fw = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
        System.out.println("Prints after the exception");
    }
}



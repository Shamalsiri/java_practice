package com.shamal.test;

public class MyClass {

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
        callingSuperClass();

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
}

package org.example;


public class _CodeOOP {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Animal myDog = new Dog();
        myDog.makeSound();
        Animal myCat = new Cat();
        myCat.makeSound();
        Animal myDeer = new Deer();
        myDeer.makeSound();


        Lion myLion = new Lion();
        myLion.makeSound();
        myLion.canEat("Veggies");
        myLion.livesWhere("jungle");
        myLion.canLiveWithHuman(false);
    }

}

    //----JAVA OOP

    //Four fundamental pillars/concepts of OOP.
    //The other three are Abstraction, encapsulation, inheritance & polymorphism.

    //Encapsulation : wrapping data and code together as a single unit
    //                                 {code acting on the data (methods)}
    //    i.e  IDriverHelper ,  DriverHelper ....all about Driver

    //Polymorphism : ability of an object to take on many forms
    //               occurs when a parent class reference is used to refer to a child class (of  many forms)
    //    i.e  multiple forms

    //Q - What is runtime polymorphism?
    //A - Runtime polymorphism is a process in which a call to an overridden method is resolved at runtime
    // rather than at compile-time.

    //Major difference between encapsulation and abstraction is?
    //abstraction is used to hide unwanted or unnecessary information.
    //encapsulation is used to hide data as a single block with all the variables and methods inside it.
    //The data can be accessed through getter and setter methods.

    //Some advantages of polymorphism are-
        //Helps in code reusability as the classes once written can be implemented again and again.
        //Single variables can store multiple data types.
        //Reduces coupling of classes unlike inheritance.

    //Some advantages of abstraction are-
        //Helps in creating a secured program as only required data is visible.
        //Reduces complexity of the program.
        //Easier implementation of the software.
        //Groups related classes as siblings



    //Overload is having multiple methods in a single class where the method has the same name
    //return value is not seen as part of the signature of the method.

    //Override is providing a different implementation of a method inherited from a base type

    //Overload is decided at COMPIILE time,  Override is decided at RUN time

    //Inheritance  {EXTENDED} : one class acquires the properties (methods and fields) of another
    //                          not all methods have to be implemented.

    //EXTENDED  - CHILD class derived from a base class (PARENT)
    //            Not all methods, needs to be implemented or override.
    //            a given class can only extend once.

    //INTERFACE - Special type of class which implements a complete abstraction
    //            To access the interface methods, the interface must be “implemented” by another class
    //            All abstract methods, are required to be implemented.
    //            a class can implement - multiple interfaces at once.
    //            an interface - cannot implement another interface.

    //A class can extend a class and can implement any number of interfaces simultaneously

    //PACKAGE
    //file directory or a folder that contains all the related classes, sub-classes, and interfaces
    //provides access protection and namespace management
    //2 types: built-in (contains fundamentals) and user defined


    //CLASS
    //A class is a collection of objects, that acts as a blueprint or template
    // a class contains fields, constructors, methods, nested class and interface.

    //CONSTRUCTOR
    //Method that is invoked when a class is instantiated and memory is allocated to the instance

    //Types of Constructors:  Default and Parametrized

    //Constructors can be overloaded;  Cannot be inherited  <a constructor of a superclass can be invoked>

    //Difference btw constructor         and          methods
        //called beginning of the class                 behavior is reflected in the method
        //dont have a return type                       can or not have a return type
        //has same name as class                        name cannot be same as class


    //WRAPPER Class
    //  provides an OO representation of a primitive data-type : boolean, int, long, double, byte, char, float, short

    //VARIABLES
    //GLOBAL - accessible by all parts of the program / project
    //LOCAL  - inside a method- cannot be accessed outside that
    //INSTANCE VARIABLE - within class, but outside the method. Associated to a copy of an object

    //STATIC - means it <method, variable, nested class> belongs to the class

    //STATIC METHOD - no requirement to make an object, can be invoked without creating an object.
    //they belong to the class, not the instance of the class.

    //INSTANCE METHOD - requires an object of the class to call or invoke.
    //they belong to the object, not the class itself

    //STRING is a non-primitive data type and its a sequence of chars in memory

    //Three types of string - explain differences

    //STRING - immutable - cannot change once is created
    //String str = "hello";

    //STRING builder - mutable - can be changed without creating a new object. Efficient manipulation of strs
    //StringBuilder sb = new StringBuilder("hello");
    //sb.append(" world");

    //STRING buffer - mutable - thread-safe (accessed by multiple objects) :: can be changed
    //StringBuffer sb = new StringBuffer("hello");
    //sb.append(" world");

    //STRING POOl - place in heap memory that stores string literal values

    //STRING FINAL -- maintains is property of inmmutability - aka cannot be changed
    // final String immutableStr = "hello";

    //==  OPERATOR   and   equals () used to check 2 objects are similar or not

    //SUPER points to the instance <method> of the super class aka the parent class
    // allow us to reuse code and avoid duplication
    //by access the parent class constructor and methods from the subclass
    /*
    public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("The animal is eating");
    }

    }

    public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // calling parent class constructor   or ANY method.
        this.breed = breed;
    }
    * */


    //TYPES OF KEYWORDS
    //public, private, class, interface, if, else, while, for, return, static, final

    // Can this keyword be used to refer to static members  >> NO

    //Calling one constructor of the class using another constructor of the same class

    //CONSTRUCTOR CHAINING
    //allows one constructor to call another constructor from the same class or from its parent class
    //Constructor chaining can also be used to call constructors from a superclass.

    /*
    public class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyClass() {
        this(0, 0); // calling the other constructor with default values
    }
}

     */


 //TYPES OF EXCEPTIONS IN JAVA
 //CHECKED <handled during compiletime>   and    UNCHECKED  <show at runtime, cannot be controlled>


  //Difference between throw and throws keyword.

 //What do you mean by OutOfMemoryError?
 //When the JVM runs out of heap memory it throws an error called OutOfMemoryError


        //Try – Exception is handled by writing the code inside the try block that might throw an exception.

        //Catch – The exception handling code is written in the catch block.

        //Throw – It is used by the user to create an exception if the code does not run in the desired way.

        //Throws – When we are aware of the checked exceptions and let the caller program know about those, the throws keyword is used before that exception.

        //Finally – This block always gets executed even if an exception is thrown. It is used with the try-catch blocks.

    /////////////////////////////////////////////////////////////
    // What is the difference between array and arrayList?
    /////////////////////////////////////////////////////////////
        //Array-
        //1. It is a dynamic object.
        //2. It is static in size, once created the size cannot be manipulated.
        //3. Can store objects and primitives.
        //4. Multidimensional.


        //ArrayList-
        //1. It is a class of Java collections framework.
        //2. It is dynamic in size. Therefore, can be resized according to the need.
        //3. Cannot store primitives.
        //4. It is always of single-dimension.


    ///////////////////////////////////////////////////////////////////
    // What is a list in Java?
    ///////////////////////////////////////////////////////////////////
        //The list is an interface in Java
        //objects can be stored in an ordered way(indexed)
        //and duplicate and null values can also be stored.
        // ArrayList, Linked List, vector, and stack are implementation classes of the List.


        //What is the Collection interface in Java?
        //It is a framework which acts as a base to store and manipulate groups of objects. Classes like ArrayList, LinkedList, Vector and interfaces like queue, list, set come under it.

     //////////////////////////////////////////////////////////////////////
     // What is a hash map?
     /////////////////////////////////////////////////////////////////////
     //Hashmap is an implementation of map interface. The data is stored in pairs in the form of key, value. The key acts as an index to another object(value). The objects stored can be retrieved in the shortest time (O(1)), if the key is known.



interface  animalAttributes{

    public  void canEat(String food);

    public void livesWhere(String location);

    public void canLiveWithHuman(Boolean canLiveWith);
}

 class Animal {

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

 }

class Dog extends Animal {

    public void makeSound() {
        System.out.println("The animal makes a WAU WAU");
    }
}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("The animal makes a MIAU");
    }
}

class Deer extends Animal {

    public void makeSound() {
        System.out.println("The animal makes a EH EH EH");
    }
}

class Lion  extends Animal implements animalAttributes {

    public void makeSound() {
        System.out.println("The animal makes a GRRRR");
    }

    @Override
    public void canEat(String food) {
        System.out.println("The animal can eat: " +food);
    }

    @Override
    public void livesWhere(String location) {
        System.out.println("The animal can live: "+ location);
    }

    @Override
    public void canLiveWithHuman(Boolean canLiveWith) {
        System.out.println("The animal is human friendly: " + canLiveWith.toString());
    }
}
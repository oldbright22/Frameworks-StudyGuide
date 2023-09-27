package org.example;

public class _CodeDesignPatterns {

    //https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial

    //Design patterns
    //               Industry-standard approach to solving a recurring problem
    //               Promotes reusability that leads to more robust and highly maintainable code
    //               Makes code easy to understand and debug
    //               Leads to faster development and new members of the team understand it easily


    // Three categories:   creational, structural, and behavioral    +    Miscellaneous


   //CREATIONAL
    /*
               SINGLETON - restricts instantiation to only one instance of the class

               FACTORY   - there is superclass with multiple subclasses and based on input,
                           we need to return one of the subclasses

               ABSTRACT  - we get rid of if-else block and have a factory class for each subclass
                           and then an abstract factory class, will return the subclass based on the input factory class

               BUILDER   - solves the issue related to large number of optional parameters and inconsistent state
                           provides a way to build object step-by-step and have a method that will return final obj.

               PROTOTYPE - copy the original Object to a new Object and then modify it per needs
                           >>>>> costly and requires a lot of time and resources


     */

   //STRUCTURAL
    /*
               ADAPTER - used for two unrelated interfaces can work together
                         The object that joins these unrelated interfaces is called an adapter.

               COMPOSITE - when we create a structure in a way that the objects in the structure have to be treated the same way

               PROXY PATTERN - provides a placeholder for another Object to control access to it.
                        >>>>> used when we want to provide controlled access to functionality

               FLYWEIGHT - used when need to create a lot of Objects of a Class
                        >>>>> applied to reduce the load on memory by sharing Objects.

                FACEDE - used to help client applications easily interact with the system


                         have 2 interface hierarchies & implementations
                BRIDGE - decouple the interfaces from the implementation and
                         hides implementation details from the client programs

                DECORATOR -  used to modify the functionality of an object at runtime

     */

   //BEHAVIORAL
    /*
                TEMPLATE - create a method stub and to defer a few steps of implementation to the subclasses

                MEDIATOR - provide a centralized communication medium between different objects in a system
                     >>>>>> mediator works as a router between objects

                CHAIN OF RESPONSIBILITY - used to achieve loose-coupling
                request from the client is passed to a chain of objects to process them

                OBSERVER

                STRATEGY

                COMMAND

                STATE

                VISITOR

                INTERPRETATOR

                ITERATOR

                MEMENTO


     */

   //MISCELLANEOUS
    /*
            DAO - keep the service layer separate from the data access layer.

            DEPENDENCY INJECTION - allows us to remove the hard-coded dependencies and
            make our application loosely-coupled, extendable, and maintainable
            i.e Sprint Framework

            MVC - create web app - Model, View, Controller

     */



}

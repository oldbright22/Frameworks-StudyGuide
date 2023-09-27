package org.example;

import java.util.LinkedList;

public class _Code {

    public static void main(String[] args) {

        //How to get the first and the last element of a linked list ?
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("100");
        lList.add("200");
        System.out.println("First element of LinkedList is : " + lList.getFirst());
        System.out.println("Last element of LinkedList is : " + lList.getLast());
        //lList.addFirst(); lList.addLast();
        //lList.pop(); lList.push();
        //lList.removeFirst(); lList.removeLast();

        //https://www.tutorialspoint.com/java/java_interview_questions.htm

        //Q - What is the default value of byte variable?
        //A - 0

        //Q - What happens when thread's sleep() method is called?
        //A - Thread returns to the waiting state.

        //Q - Static binding uses which information for binding?
        //A - type

        //Q - Method Overloading is an example of  >> Static Binding

        //Q - What is function overriding?
        //A - If a subclass provides a specific implementation of a method that is already provided by its parent class,
        // it is known as Method Overriding.

        //Q - What is synchronization?
        //A - Synchronization is the capability to control the access of multiple threads to shared resources.

        //Q - What is an applet?
        //A - An applet is a Java program that runs in a Web browser.

        //Q - What is the default value of long variable?
        //A - 0L

        //Q - Under what conditions is an object's finalize() method invoked by the garbage collector?
        //A - When it detects that the object has become unreachable.

        //Q - What is inheritance?
        //A - It is the process where one object acquires the properties of another.

        //Q - Is an empty .java file a valid source file?
        //A - True

        //Q - Which of the following is false about String?
        //C - String is a primary data type.

        //Q - Objects are stored on Stack.  >> FALSE

        //Q - What is currentThread()?
        //A - It is a Thread public static method used to obtain a reference to the current thread.

        //Q - What is a class in java?
        //A - A class is a blue print from which individual objects are created. A class can contain fields and methods to describe the behavior of an object.

        //Q - Can be constructor be made private?
        //A - True.

        //Q - What invokes a thread's run() method?
        //A - JVM invokes the thread's run() method when the thread is initially executed.


        //MODIFIERS
        //Default – applicable if no other modifier is specified.
        // The access level is within the current package and cannot be accessed outside the package.

        //Private – Access is within the current class and not outside of it.

        //Protected – Access within the current package unless a child class is created outside the package.
        // then it can be accessed through a child’s class.

        //Public – As the name suggests there is no restriction.
        // It can be accessed from within the class/package or outside the class/package.

    }
}
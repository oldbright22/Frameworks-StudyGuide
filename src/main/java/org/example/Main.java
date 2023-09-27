package org.example;








public class Main {
    public static void main(String[] args) {

        String s = "ab28+^cd&thk";

        System.out.println("Hello world!");
    }

    public String OnlyAlpha(String value)
    {
        String s = "";


        for (int i=0; i < value.length(); i++)
        {
            char eval= value.charAt(i);
            if  (Integer.valueOf(eval)  > 45 &&
                Integer.valueOf(eval)   < 60){
                   s=s+eval;
            }
        }

        return s;
    }
}



/*

  What is static binding   vs   dynamic  binding

  TESTNG
      @Test(enabled = false)                                  // Ignore a test
      @Test(expectedExceptions = ArithmeticException.class)   // For tracing exceptions


      @Test(dependsOnMethods = { "initEnvironmentTest" })     // Allow to specify dependencies from other @test/method
      @Test(dependsOnGroups  = { "" })


      <suite name="My suite" parallel="methods" thread-count="5">
                                      "tests"
                                      "classes"
                                      "instances"


      @Test
      @Parameters("myName")
      public void parameterTest(String myName) {
        System.out.println("Parameterized value is : " + myName);
      }



Mockito
Mockito is a framework for the creation of "test doubles"
 in automated unit tests for the purpose of TDD or BDD.

MockServer
You can use MockServer for mocking any system you integrate
with via HTTP or HTTPS (i.e. services, web sites, etc).

WireMock
WireMock is a simulator for HTTP-based APIs,
similar to MockServer.


///////////////////////////////////////////////////////////////////////////////////////////////

@FindBy is an annotation in Selenium
that is used to locate web elements on a web page.

It is used in conjunction with the Page Object Model (POM) design pattern





Test Automation Framework

    Programing Languange = JAVA, Libraries like POI,
    Type of Framework    = Data Driven Framework    ----> Json,Excel,DB (Sql, any)
                                                    ----> POM

    Different Packages   =
    <folder structure u have>
                             Helpers      < File Read, JSON Parser, Wrapper of WebDriver elements, methods >
                             Listeners    < Custom listeners, Custom logging, Screenshot capture >
                             Resources    <  reports, screenshots >
                             Config Properties < dev, staging, prod >
                             Reports      <  Junit, default reporting >
                             TestNG       < parallel execution, grouping, assertions --- Soft  |  Hard >
                             POM          < profiles > browsers > {FF, CHR, EDGE},  dev, staging, etc>
                             CI / CD      < Jenkins {nightly builds, daily builds, trigger mechanism?}
                                            Test Execution status, email, screenshots, flaky tests
                                            Git Used





///////////////////////////////////////////////////////////////////////////////////////////////

JAVA IS NOT 100% -- yes due primitives   {boolean, byte, char, int, float, double, long, short}

WHY POINTERS are not allowed in JAVA -- JVM is responsible for implicit memory allocation (discouraged in java)
towards avoid direct access to memory by the user.

WHAT IS JIT compiler in JAVA : compiles Java bytecode into native machine code at runtime.
allows to approach performance native code, yet maintain still platform independence

WHY STRING IS inmutable in JAVA?
value once is created cannot be changed - since it's stored in memory as sequence of chars
if a change made, a new object is created; align to be thread safe.

WHAT IS A Marker Interface?
Interface having no data members, no methods/functions.
Is called a Marker due - is clonable and serializable


CAN YOU OVERRIDE A PRIVATE or STATIC METHOD in JAVA?
PRIVATE you cannot override because it's not accessible < create same method name in child class>
STATIC  if created same (returntype, params) in child class, it will hide in superclass, called method hiding.


DOES FINALLY ALWAYS EXECUTES?
NO if system crashes
or if system exists via  System.exit() function


WHAT METHODS DOES THE OBJECT CLASS has?

clone     - create same exact object
equal     - compares input object to actual object - determine if they are equal or not
finalize  - called by garbage collector - determines if there is no more references to the object
hashcode  - returns a hashcode for the object
getClass  - returns the runtimeClass of the object


WHY MAP does not extend Collection interface?

MAP is a key/value pair structure
where as the collection - is a collection of objects stored in a structured manner - specific way
Add method, does not support key/value pair structure


BLOCKING QUEUE
multiple threads can insert and take elements concurrently from BlockingQueue - withno concurrency issues
Can block thread, that attempts to take an element, until in-fact one element is present.


WHAT are differences?
SYNCHRONIZED collection      |  CONCURRENT collection
--slower                       --faster
all segments locked            only 1 segment is locked -- rest of the segments remain open

Performance and scalability



////////////////////////////////////////////////////////////////////////////////////////////////
SINGLETON class
a class that can only have one instance throughout the runtime of an application.
////////////////////////////////////////////////////////////////////////////////////////////////

//One instance, one time,  One JVM
public class Singleton {
    private static Singleton instance;   //due static, only one instance of the class throughout runtime of the app

    private Singleton() {
        // private constructor to prevent instantiation from outside
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void someMethod() {
        // ...
    }
}


USAGE ---
Singleton singleton = Singleton.getInstance();
singleton.someMethod();



/////////////////////////////////////////////////////////////////////////////////////////////////////

public final class ImmutableClass {

   ///////////////////////////////////////////////////////////////////////////
   //   FINAL attributes once initialized they cannot be modified - ergo final
   ///////////////////////////////////////////////////////////////////////////

    private final int value1;
    private final String value2;

    public ImmutableClass(int value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }
}
 */
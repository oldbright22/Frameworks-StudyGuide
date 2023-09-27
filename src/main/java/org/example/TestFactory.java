package org.example;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

class TestClass {
    private String str;

    //Constructor
    public TestClass(String str) {
        this.str = str;
    }

    @Test
    public void TestMethod() {
        System.out.println(str);
    }
}

public class TestFactory{
    //The test methods in class TestClass will run twice with data "k1" and "k2"
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new TestClass("K1"), new TestClass("k2") };
    }
}



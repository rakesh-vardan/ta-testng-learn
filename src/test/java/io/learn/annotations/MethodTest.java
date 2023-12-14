package io.learn.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Inside beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Inside afterMethod");
    }

    @Test
    public void testMethod() {
        System.out.println("Inside testMethod");
    }

    @Test
    public void testMethod2() {
        System.out.println("Inside testMethod2");
    }

    @Test
    public void testMethod3() {
        System.out.println("Inside testMethod3");
    }

}

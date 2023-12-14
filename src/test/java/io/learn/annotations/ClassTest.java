package io.learn.annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ClassTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Inside beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Inside afterClass");
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

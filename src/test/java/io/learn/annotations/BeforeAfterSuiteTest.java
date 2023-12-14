package io.learn.annotations;

import org.testng.annotations.*;

public class BeforeAfterSuiteTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Inside beforeSuite");
        //steps required to get the DB connection object
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Inside afterSuite");
        //close the DB connection
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Inside beforeTest");
        //setup required to perform your tests
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Inside afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Inside beforeClass");
        //create the browser object - use it in the subsequent tests
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Inside afterClass");
    }

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

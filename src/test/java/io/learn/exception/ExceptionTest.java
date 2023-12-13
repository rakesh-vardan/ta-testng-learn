package io.learn.exception;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testMethod1() {
        System.out.println("This method will throw an exception");
        int a = 10 / 0;
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testMethod2() {
        System.out.println("This method will throw an exception");
        int a[] = new int[2];
        a[4] = 10;
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testMethod3() {
        System.out.println("This method will not throw any exception");
    }
}

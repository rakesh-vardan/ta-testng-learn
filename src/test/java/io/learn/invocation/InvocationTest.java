package io.learn.invocation;

import org.testng.annotations.Test;

public class InvocationTest {

    @Test(invocationCount = 3)
    public void firstMethod() {
        System.out.println("In First method");
    }

    @Test(invocationTimeOut = 900, invocationCount = 10)
    public void secondMethod() throws InterruptedException {
        Thread.sleep(100);
    }
}

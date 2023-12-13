package io.learn.enable;

import org.testng.annotations.Test;

public class EnableDisableTest {

    @Test(description = "First Test Method")
    public void firstMethod() {
        System.out.println("In firstMethod");
    }

    //skip this test method from execution
    @Test(description = "Second Test Method", enabled = false)
    public void secondMethod() {
        System.out.println("In secondMethod");
    }

    @Test(description = "Third Test Method")
    public void thirdMethod() {
        System.out.println("In thirdMethod");
    }

}

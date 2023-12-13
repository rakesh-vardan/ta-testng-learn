package io.learn.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FirstTest2 {

    public void firstMethod() {
        System.out.println("In firstMethod");
    }

    public void secondMethod() {
        System.out.println("In secondMethod");
    }

    public void thirdMethod() {
        Assert.assertEquals(1, 1);
    }

    public void fourthMethod() {
        Assert.assertEquals(1, 2);
    }

}

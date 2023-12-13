package io.learn.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstMethod() {
        System.out.println("In firstMethod");
    }

    @Test
    public void secondMethod() {
        System.out.println("In secondMethod");
    }

    @Test
    public void thirdMethod() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void fourthMethod() {
        Assert.assertEquals(1, 2);
    }

}

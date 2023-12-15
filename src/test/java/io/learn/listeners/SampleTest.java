package io.learn.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Listener1.class)
public class SampleTest {

    @Test
    public void sum() {
        int a = 7;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum is: " +sum);
    }

    @Test
    public void testToFail() {
        System.out.println("Test case failed");
        Assert.assertTrue(1 == 2);
    }
}

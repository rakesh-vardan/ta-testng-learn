package io.learn.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

    @Test(retryAnalyzer = Retry.class)
    public void testMe() {
        Assert.assertTrue(false);
    }

    @Test(retryAnalyzer = Retry.class)
    public void testMe2() {
        Assert.assertTrue(true);
    }
}

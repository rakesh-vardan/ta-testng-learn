package io.learn.timeout;

import org.testng.annotations.Test;

public class TimerTest {

    @Test(timeOut = 2)
    public void firstMethod() throws InterruptedException {
        Thread.sleep(5000); //halts the execution for 5 seconds
        System.out.println("In firstMethod");
    }

    @Test
    public void secondMethod() {
        System.out.println("In secondMethod");
    }
}

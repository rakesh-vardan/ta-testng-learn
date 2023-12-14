package io.learn.groups;

import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = "SmokeTest")
    public void testMethod1() {
        System.out.println("Inside GroupTest -> testMethod1");
    }

    @Test(groups = "SanityTest")
    public void testMethod2() {
        System.out.println("Inside GroupTest -> testMethod2");
    }

    @Test(groups = { "SmokeTest", "SanityTest" })
    public void testMethod3() {
        System.out.println("Inside GroupTest -> testMethod3");
    }

}

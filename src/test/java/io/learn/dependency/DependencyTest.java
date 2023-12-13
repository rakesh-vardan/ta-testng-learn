package io.learn.dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void firstMethod() {
//        System.out.println("In firstMethod");
        Assert.assertEquals(1, 1);
    }

    //Will be executed as the dependent test method is passed
    @Test(dependsOnMethods = "firstMethod")
    public void secondMethod() {
        System.out.println("In secondMethod");
        Assert.assertEquals(1, 2);
    }

    //Will be ignored as one of the dependent test method is failed
    @Test(dependsOnMethods = {"firstMethod" , "secondMethod"})
    public void thirdMethod() {
        System.out.println("In thirdMethod");
    }

    @Test
    public void fourthMethod() {
        System.out.println("In fourthMethod");
    }

}

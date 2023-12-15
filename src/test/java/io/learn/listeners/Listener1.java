package io.learn.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case is passed! and its details are: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //write the logic to take screenshot of application page using selenium
        System.out.println("Test case is failed! and its details are: " +result.getName());
    }
}

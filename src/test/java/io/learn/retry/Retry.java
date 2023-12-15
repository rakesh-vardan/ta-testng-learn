package io.learn.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int retryCount = 0;
    int maxRetryCount = 5;

    @Override
    public boolean retry(ITestResult result) {
        if(!result.isSuccess()) {
            //test is failed
            if(retryCount < maxRetryCount) {
                System.out.println("Retrying Test: Rerunning " + result.getName() + " for " +(retryCount + 1) + " time(s).");
                retryCount++;
                result.setStatus(ITestResult.FAILURE);
                return true;
            } else {
                result.setStatus(ITestResult.FAILURE);
            }
        } else {
            //test is passed
            result.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }
}

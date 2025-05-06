package testng.retryfailcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailScriptExecution implements IRetryAnalyzer {

    private int MIN_Value = 0;
    private int MAX_VALUE = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (MIN_Value < MAX_VALUE) {

            MIN_Value++;
            return true;
        }
        return false;
    }
}

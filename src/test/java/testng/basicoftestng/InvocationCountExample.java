package testng.basicoftestng;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 10000, invocationTimeOut = 1)
    public void verifyTestCheck(){
        System.out.println("Hello how Are You???");
    }
}

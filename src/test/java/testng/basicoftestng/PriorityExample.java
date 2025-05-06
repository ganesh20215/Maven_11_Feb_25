package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.retryfailcases.FailScriptExecution;

public class PriorityExample {

    @Test(priority = -1, enabled = true)
    public void verifyCaseZ() {
        System.out.println("Verify Case Z");
    }

    @Test(priority = 'C')
    public void verifyCaseA() {
        System.out.println("Verify Case A");
    }

    @Test(priority = -3)
    public void verifyCaseM() {
        Assert.assertTrue(false);
        System.out.println("Verify Case M");
    }

    @Test(priority = 4, groups = "smoke")
    public void verifyCaseB() {
        System.out.println("Verify Case B");
    }

    @Test(priority = -3)
    public void verifyCaseH() {
        System.out.println("Verify Case H");
    }
}

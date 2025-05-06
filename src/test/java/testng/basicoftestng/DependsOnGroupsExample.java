package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = {"smoke"})
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
        System.out.println("Good Morning");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyPayment() {
        System.out.println("Verify Payment");
    }

    @Test
    public void verifyOnboarding() {
        System.out.println("Verify Onboarding");
    }
}

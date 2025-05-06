package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsExample {


    @Test()
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage() {
        System.out.println("Verify Login");
    }

    @Test(groups = "smoke")
    public void verifyOnboarding() {
        System.out.println("Verify Onboarding");
    }
}

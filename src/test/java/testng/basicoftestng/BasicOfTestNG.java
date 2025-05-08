package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOfTestNG {

    @Test
    public void verifyEdsoServices() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void verifyAmazon() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void verifyFlipkart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}

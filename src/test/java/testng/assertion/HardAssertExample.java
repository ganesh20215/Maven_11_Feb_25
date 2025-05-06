package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifySauceDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        Assert.assertTrue(userNameTextBox.isDisplayed(), "UserName textbox should be displayed");
        Assert.assertEquals(driver.getTitle(), "Swag", "Swag Labs title should be matched");
        userNameTextBox.sendKeys("standard_user");
        Thread.sleep(3000);
        driver.close();
    }
}

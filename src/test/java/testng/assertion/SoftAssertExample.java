package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertExample() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        sf.assertTrue(userNameTextBox.isDisplayed(), "UserName textbox should be displayed");
        sf.assertEquals(driver.getTitle(), "Swag", "Swag Labs title should be matched");
        userNameTextBox.sendKeys("standard_user");
        Thread.sleep(3000);
        sf.assertAll();
        driver.close();
    }
}

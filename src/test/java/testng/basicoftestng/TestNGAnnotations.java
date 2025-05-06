package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    @Test
    public void verifyRefiffmailLogin() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void postRequsite(){
        driver.close();
    }
}

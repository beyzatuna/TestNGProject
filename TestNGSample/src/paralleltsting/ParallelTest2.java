package paralleltsting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @Test
    void loginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/BEYZA TUNA/Downloads/selenium/ChromeDriver/chromedriver.exe");
        Thread.sleep(5000);
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(@class, 'orangehrm-login-button')]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

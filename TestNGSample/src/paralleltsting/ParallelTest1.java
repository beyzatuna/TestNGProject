package paralleltsting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/BEYZA TUNA/Downloads/selenium/ChromeDriver/chromedriver.exe");
        Thread.sleep(1000);
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/samplepagetest/");
        Thread.sleep(1000);
        WebElement logo = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(logo.isDisplayed());


    }

    @Test
    void homePageTtitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/BEYZA TUNA/Downloads/selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

    }

    @AfterMethod
    void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}

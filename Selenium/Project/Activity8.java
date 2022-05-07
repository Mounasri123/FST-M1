package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity81 {
    WebDriver driver;

    @BeforeClass
    public void loginForm() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

    }
    @Test
        public void landingPage(){
             driver.findElement(By.id("user_login")).sendKeys("root");
             driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
             driver.findElement(By.id("wp-submit")).click();
             String title = driver.getTitle();
             Assert.assertEquals(title,"Dashboard ‹ Alchemy Jobs — WordPress");
             driver.close();


        }

    }



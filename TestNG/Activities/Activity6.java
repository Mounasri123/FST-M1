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

public class Activity61 {
        WebDriver driver;
        @BeforeClass
        public void setUp(){
            driver = new FirefoxDriver();
            driver.get("https://alchemy.hguy.co/jobs/");
        }
        @Test
        public void secondHeaderValidation() throws InterruptedException {
            driver.findElement(By.xpath("//div[contains(@class,'main-navigation')]/ul/li[1]/a")).click();
            driver.findElement(By.id("search_keywords")).sendKeys("Banking");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
            driver.findElement(By.xpath("//ul[contains(@class,'job_listings')]/li[4]/a")).click();
            driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
            String email = driver.findElement(By.xpath("//a[contains(@class,'job_application_email')]")).getText();
            System.out.println(email);
            Reporter.log("Job Applied");
        }
        @AfterClass
        public void cleanUp(){
            driver.close();
        }
    }


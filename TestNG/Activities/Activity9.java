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

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void loginForm() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

    }

    @Test
    public void landingPage() throws InterruptedException {
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Dashboard ‹ Alchemy Jobs — WordPress");
        driver.findElement(By.xpath("//li[contains(@id,'menu-posts-job_listing')]/a")).click();
        driver.findElement(By.xpath("//a[contains(@class,'page-title-action')]")).click();
        driver.findElement(By.xpath("//div/textarea[contains(@class,'editor-post-title__input')]")).sendKeys("mobile testing");
        driver.findElement(By.xpath("//input[contains(@name,'_application')]"));
        driver.findElement(By.xpath("//input[contains(@name,'_job_location')]")).sendKeys("Bhimavaram");
        driver.findElement(By.xpath("//input[contains(@name,'_company_website')]")).sendKeys("www.ibm.com");
        driver.findElement(By.xpath("//input[contains(@name,'_company_name')]")).sendKeys("IBM");
        driver.findElement(By.xpath("//input[contains(@name,'_company_tagline')]")).sendKeys("Mouna company");
        driver.findElement(By.xpath("//input[contains(@name,'_company_twitter')]")).sendKeys("tweet43");
        driver.findElement(By.xpath("//input[contains(@name,'_company_video')]")).sendKeys("mm");
        driver.findElement(By.name("_filled")).click();
        driver.findElement(By.name("_featured")).click();
        driver.findElement(By.xpath("//input[contains(@name,'_job_expires-datepicker')]")).sendKeys("April 25, 2022");
        driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'components-button editor-post-publish-button')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'components-button is-secondary')]")).click();
        String ele = driver.findElement(By.xpath("//div/h1[contains(@class,'entry-title')]")).getText();
        Assert.assertEquals(ele,"mobile testing");
        driver.close();

    }
}


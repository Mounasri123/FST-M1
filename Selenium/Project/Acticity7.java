package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Acticity7{
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void secondHeaderValidation() throws InterruptedException {

        driver.findElement(By.xpath("//div[contains(@class,'main-navigation')]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id='create_account_email']")).sendKeys("krishna48@email.com");
        driver.findElement(By.xpath("//*[@id='job_title']")).sendKeys("tester");
        Select jobtext = new Select(driver.findElement(By.id("job_type")));
        jobtext.selectByVisibleText("Full Time");
        driver.switchTo().frame("job_description_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("To test the application");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("application")).sendKeys("sant2@email.com");
        driver.findElement(By.id("company_name")).sendKeys("IBM");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='Preview']")).click();
        driver.findElement(By.id("job_preview_submit_button")).click();

    }
    @Test
    public void thirdheadervalidation(){
        driver.findElement(By.xpath("//div[contains(@class,'main-navigation')]/ul/li[1]/a")).click();
        driver.findElement(By.id("search_keywords")).sendKeys("tester");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//ul[contains(@class,'job_listings')]/li[1]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text= driver.findElement(By.xpath("//ul[contains(@class,'job_listings')]/li[1]/a/div/h3")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"tester");
    }
    @AfterClass
    public void cleanUp(){
        driver.close();
    }
}


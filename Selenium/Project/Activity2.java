package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {
    @Test
    public void titleValidation() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        String actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        String expectedTitle = driver.findElement(By.xpath("//h1[contains(@class,'entry-title')]")).getText();
        Assert.assertEquals(expectedTitle,"Welcome to Alchemy Jobs");
        driver.close();

    }
}



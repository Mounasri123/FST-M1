package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity4 {
    @Test
    public void titleValidation() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        String actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        String expectedTitle = driver.findElement(By.xpath("//h2")).getText();
        Assert.assertEquals(expectedTitle,"Quia quis non");
        driver.close();

    }
}

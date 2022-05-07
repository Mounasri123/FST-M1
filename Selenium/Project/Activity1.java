package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
    @Test
    public void titleValidation() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        String actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        String expectedTitle = "Alchemy Jobs – Job Board Application";
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();


    }
}

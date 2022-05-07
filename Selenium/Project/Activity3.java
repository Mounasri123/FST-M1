package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity3 {
    @Test
    public void titleValidation() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        WebElement img = driver.findElement(By.xpath("//img"));
        System.out.println("Src attribute is: "+ img.getAttribute("src"));
        driver.close();
    }
}
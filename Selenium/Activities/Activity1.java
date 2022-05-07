package examples;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        String actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        String expectedTitle = "Alchemy Jobs – Job Board Application";
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Title didn't match");
        }
        driver.close();
        driver.quit();

    }

}

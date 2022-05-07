package examples;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        String actualTitle = driver.getText();
        driver.manage().window().maximize();
        String expectedText = "Welcome to Alchemy Jobs";
        if(actualTitle.equalsIgnoreCase(expectedText)) {
            System.out.println("Text Matched");
        } else
            System.out.println("Text didn't match");
        driver.close();
        driver.quit();

    }

}
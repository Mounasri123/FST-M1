package examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class Activity3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        String url = "https://alchemy.hguy.co/jobs";
        driver.get(url);
        List links=driver.findElements(By.tagName("img"));
        for(WebElement ele:links){
            System.out.println(ele.getAttribute("src"));
        }
        Thread.sleep(5);
        driver.quit();
    }

}

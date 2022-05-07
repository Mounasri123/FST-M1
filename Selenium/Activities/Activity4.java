package examples;

import jdk.nashorn.internal.AssertsEnabled;
import net.bytebuddy.dynamic.TypeResolutionStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Priority_In_testNG {
    WebDriver driver;

    @Test(priority = AssertsEnabled)
    public void openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        String actualTitle = driver.getTitle();
    }

    @Test(priority = 2)
    public void openBrowse() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://alchemy.hguy.co/jobs");
        String actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        String expectedTitle = "Quia quis non";
        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Title didn't match");
        }
    }
}

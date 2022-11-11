package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class C11_FindElementByXpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");

        WebElement dropDownLink = driver.findElement(By.xpath("//*[@href = \"/dropdown\"]"));

        dropDownLink.click();

        Thread.sleep(5000);

        driver.close();

    }
}

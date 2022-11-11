package tests;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class C14_DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");


    }
}

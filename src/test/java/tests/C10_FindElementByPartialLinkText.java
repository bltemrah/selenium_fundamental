package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C10_FindElementByPartialLinkText {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");

        WebElement element = driver.findElement(By.linkText("A/B Testing"));

        System.out.println("element.getText() = " + element.getText());

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Thread.sleep(3000);

        WebElement partialLinkText = driver.findElement(By.partialLinkText("Drag"));
        System.out.println("partialLinkText.getText() = " + partialLinkText.getText());

        partialLinkText.click();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());

        Thread.sleep(3000);

        driver.close();

    }
}

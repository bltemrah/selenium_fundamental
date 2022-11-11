package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C07_FindElementByTagName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com");

        WebElement element = driver.findElement(By.tagName("h1"));

        System.out.println("element.getText() = " + element.getText());

        driver.close();

    }
}

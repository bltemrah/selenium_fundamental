package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C08_FindElementByName {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com");

        WebElement element = driver.findElement(By.xpath("//*[@href = \"/multiple_buttons\"]"));
        Thread.sleep(3000);
        element.click();

        Thread.sleep(3000);

        WebElement button2 = driver.findElement(By.name("button2"));
        Thread.sleep(3000);
        button2.click();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println("result.getText() = " + result.getText());

        driver.close();

    }
}

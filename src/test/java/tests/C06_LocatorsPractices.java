package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C06_LocatorsPractices {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://google.com");

        Thread.sleep(3000);

        WebElement acceptAll = driver.findElement(By.xpath("(//*[@class = \"QS5gu sy4vM\"])[2]"));
        acceptAll.click();

//        //*[text()= "Accept all"]
        WebElement element = driver.findElement(By.id("gbqfbb"));

//        to have the test of the attribute
        String actualText = element.getAttribute("value");

        String expectedText = "I'm Feeling Lucky";

        if (actualText.equals(expectedText)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
            System.out.println("actualText = " + actualText);
            System.out.println("expectedText = " + expectedText);
        }

        Thread.sleep(3000);
        driver.close();

    }
}

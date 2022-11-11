package tests.task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TaskNlyte {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.asos.com/");

        WebElement menu = driver.findElement(By.xpath("//*[@aria-label = \"My Account\"]"));
        Thread.sleep(3000);

        //Creating object of an Actions class
        Actions actions = new Actions(driver);

        //Performing the mouse hover action on the target element.
//        action.moveToElement(menu).perform();
        actions.moveToElement(menu);
        Thread.sleep(3000);
//        menu.click();
//        WebElement myAccount = driver.findElement(By.xpath("//*[text() = \"My Account\"]"));
        WebElement myAccount = driver.findElement(By.xpath("(//*[@class = \"_12ChTgQ\"]/li/a)[1]"));
        Thread.sleep(3000);
        actions.moveToElement(myAccount);

        Thread.sleep(3000);
        actions.click().build().perform();

    }
}
